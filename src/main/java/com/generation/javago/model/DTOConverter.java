package com.generation.javago.model;

import com.generation.javago.model.dto.PlaneTicketDTOReq;
import com.generation.javago.model.dto.PlaneTicketDTOResp;
import com.generation.javago.model.dto.TravelerDTOReq;
import com.generation.javago.model.dto.TravelerDTOResp;
import com.generation.javago.model.entities.PlaneTicket;
import com.generation.javago.model.entities.Traveler;
import com.generation.javago.model.repositories.PlaneTicketRepository;
import com.generation.javago.model.repositories.TravelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class DTOConverter
{
	@Autowired
	PlaneTicketRepository pRepo;

	@Autowired
	TravelerRepository tRepo;


	public PlaneTicketDTOResp toPlaneTicketDTO(PlaneTicket planeTicket)
	{
		PlaneTicketDTOResp res = new PlaneTicketDTOResp();
		res.setId(planeTicket.getId());
		res.setPrice(planeTicket.getPrice());
		res.setLandingAirport(planeTicket.getLandingAirport());
		res.setStartingAirport(planeTicket.getStartingAirport());
		res.setTakeOffTime(planeTicket.getTakeOffTime().toString());
		res.setTravelerName(planeTicket.getTraveler().getName());
		res.setTravelerSurname(planeTicket.getTraveler().getSurname());
		res.setTravelerPhone(planeTicket.getTraveler().getPhone());

		return res;
	}

	public PlaneTicket toPlaneTicket(PlaneTicketDTOReq dto)
	{
		PlaneTicket res = new PlaneTicket();
		res.setStartingAirport(dto.getStartingAirport());
		res.setLandingAirport(dto.getLandingAirport());
		res.setPrice(dto.getPrice());
		res.setTakeOffTime(LocalDateTime.parse(dto.getTakeOffTime()));

		Traveler viaggiatore  = tRepo.findById(dto.getTravelerId()).get();
		res.setTraveler(viaggiatore);
		return res;
	}

	public Traveler toTraveler(TravelerDTOReq dto)
	{
		Traveler res = new Traveler();
		res.setName(dto.getName());
		res.setSurname(dto.getSurname());
		res.setPhone(dto.getPhone());
		res.setEmail(dto.getEmail());
		res.setAddress(dto.getAddress());
		res.setProfession(dto.getProfession());
		res.setDob(LocalDate.parse(dto.getDob()));
		return res;
	}

	public TravelerDTOResp toTravelerDTO(Traveler t)
	{
		TravelerDTOResp res = new TravelerDTOResp();
		res.setId(t.getId());
		res.setName(t.getName());
		res.setSurname(t.getSurname());
		res.setPhone(t.getPhone());
		res.setEmail(t.getEmail());
		res.setAddress(t.getAddress());
		res.setProfession(t.getProfession());
		res.setDob(t.getDob().toString());
		return res;
	}
}
