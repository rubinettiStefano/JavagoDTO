package com.generation.javago;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.generation.javago.model.entities.PlaneTicket;
import com.generation.javago.model.entities.Traveler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class JavagoApplicationTests
{

	@Test
	void contextLoads() throws JsonProcessingException
	{

		Traveler t = new Traveler();
		t.setName("Stefano");
		t.setSurname("Rubinetti");
		t.setAddress("Via non lo dico, 420");
		t.setDob(LocalDate.of(1995,8,27));
		t.setEmail("rubinetti.stefano@gmail.com");
		t.setPhone("3898272664");
		t.setProfession("Teacher");


		PlaneTicket pt = new PlaneTicket();
		pt.setPrice(19.98);
		pt.setStartingAirport("Torino Caselle");
		pt.setLandingAirport("Antartica");
		pt.setTakeOffTime(LocalDateTime.now());

		t.getTickets().add(pt);
		pt.setTraveler(t);

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		String bigliettoJsonizzato = mapper.writeValueAsString(t);

		System.out.println(bigliettoJsonizzato);

	}


}
