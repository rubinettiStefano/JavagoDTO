package com.generation.javago;

import com.generation.javago.model.entities.Traveler;
import com.generation.javago.model.repositories.TravelerRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class TravelerApiTest
{
	//@SpringBootTest configura questa classe per essere una classe
	//di test di spring. Da accesso al Context di Spring

	//@AutoConfigureMockMvc ci permette di usare MockMvc

	//@Test si mette sopra i metodi e indica che quelli sono metodi
	//di test, metodi da eseguire che possono passare o fallire

	//@BeforeEach
	//@BeforeAll
	//si mettono sopra metodi che configurano l'ambiente di test
	//magari puliscono/riempiono il db
	//fanno operazioni necessarie per far andare il test
	//con @BeforeEach  indichiamo un metodo che va eseguito 1 volta prima
	//di ogni metodo di Test
	//con @BeforeAll indichiamo un metodo che va eseguito 1 volta sola
	//prima di far partire il test vero e proprio
	//a quanto pare non piace ai test di spring

	//abbiamo anche il contrario, gli @AfterEach e @AfterAll (immagino non piaccia nemmeno lui)
	@Autowired
	private MockMvc mock;

	@Autowired
	private TravelerRepository travelerRepository;

	@BeforeEach
	public void vengoChiamatoPrimaDiOgniMetodo()
	{
		//voglio ripulire il database e inserirci i dati con cui lavorare
		travelerRepository.deleteAll();

		Traveler traveler1 = new Traveler(
				"John",
				"Doe",
				"123 Main St, Springfield",
				"john.doe@example.com",
				"555-1234",
				"Engineer",
				LocalDate.of(1985, 5, 15)
		);

		Traveler traveler2 = new Traveler(
				"Jane",
				"Smith",
				"456 Elm St, Shelbyville",
				"jane.smith@example.com",
				"555-5678",
				"Doctor",
				LocalDate.of(1990, 8, 22)
		);

		Traveler traveler3 = new Traveler(
				"Bob",
				"Brown",
				"789 Oak St, Capital City",
				"bob.brown@example.com",
				"555-9012",
				"Teacher",
				LocalDate.of(1978, 3, 10)
		);

		// Salvataggio nel database tramite il repository
		travelerRepository.save(traveler1);
		travelerRepository.save(traveler2);
		travelerRepository.save(traveler3);

	}



	@Test
	public void testGetTravelers() throws Exception
	{

		mock
				.perform(get("/api/travelers"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].name").value("John"))
				.andExpect(jsonPath("$[0].surname").value("Doe"))
				.andExpect(jsonPath("$[0].address").value("123 Main St, Springfield"))
				.andExpect(jsonPath("$[0].email").value("john.doe@example.com"))
				.andExpect(jsonPath("$[0].phone").value("555-1234"))
				.andExpect(jsonPath("$[0].profession").value("Engineer"))
				.andExpect(jsonPath("$[0].dob").value("1985-05-15"))
				.andExpect(jsonPath("$[0].totalSpending").value("0.0"))
				.andExpect(jsonPath("$[0].numberOfTickets").value("0"))
				.andExpect(jsonPath("$[1]").exists())
				.andExpect(jsonPath("$[2]").exists())
				.andExpect(jsonPath("$[3]").doesNotExist());
	}

	@Test
	public void testPostTraveler()
	{
		System.out.println("ciao sono test post");
	}
}
