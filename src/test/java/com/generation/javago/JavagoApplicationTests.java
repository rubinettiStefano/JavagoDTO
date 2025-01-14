package com.generation.javago;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.generation.javago.model.DTOConverter;
import com.generation.javago.model.entities.PlaneTicket;
import com.generation.javago.model.entities.Traveler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@SpringBootTest
class JavagoApplicationTests
{


	@Test
	void contextLoads() throws JsonProcessingException
	{
		List<Integer> numeri = new ArrayList<>();
		numeri.add(1);
		numeri.add(222);
		numeri.add(2);
		numeri.add(2752);
		numeri.add(2572);
		numeri.add(56);
		numeri.add(123);
		numeri.add(24);

		 //collezione AMORFA (senza una vera e propria struttura) pensata per LAVORARE sui dati che contiene

		//parto da una collezione vera (lista,array,set,ecc..), la converto in uno stream, che alla fine riconverto in una collezione vera

		//lista int -> Stream<Integer>
		List<Integer> numeriFiltrati =  numeri.stream().filter(n->n>20).toList();

		String[] parole = new String[3];

		parole[0] = "aa";
		parole[1] = "bb";
		parole[2] = "cc";


	}


}
