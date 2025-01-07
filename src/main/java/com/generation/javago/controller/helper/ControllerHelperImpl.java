package com.generation.javago.controller.helper;

import com.generation.javago.model.DTOConverter;
import com.generation.javago.model.dto.*;
import com.generation.javago.model.entities.PlaneTicket;
import com.generation.javago.model.entities.Traveler;
import com.generation.javago.model.repositories.PlaneTicketRepository;
import com.generation.javago.model.repositories.TravelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControllerHelperImpl implements ControllerHelper
{
	@Autowired
	DTOConverter dtoConverter;
	@Autowired
	PlaneTicketRepository pRepo;
	@Autowired
	TravelerRepository tRepo;

	@Override
	public PlaneTicketDTOResp findTicketById(long id)
	{
		PlaneTicket pt = pRepo.findById(id).get();
		return dtoConverter.toPlaneTicketDTO(pt);
	}

	@Override
	public PlaneTicketDTOResp saveTicket(PlaneTicketDTOReq req)
	{
		PlaneTicket pt = dtoConverter.toPlaneTicket(req);
		pRepo.save(pt);
		return dtoConverter.toPlaneTicketDTO(pt);
	}

	@Override
	public TravelerDTORespDetail findTravelerById(long id)
	{
		Traveler t = tRepo.findById(id).get();
		return dtoConverter.toTravelerDTODetail(t);
	}

	@Override
	public TravelerDTORespSummary saveTraveler(TravelerDTOReq req)
	{
		Traveler t = dtoConverter.toTraveler(req);
		tRepo.save(t);
		return dtoConverter.toTravelerDTO(t);
	}

	@Override
	public List<TravelerDTORespSummary> findAllTravelers()
	{
		List<Traveler> all = tRepo.findAll();

		List<TravelerDTORespSummary> res = new ArrayList<>();

		for(Traveler t : all)
			res.add(dtoConverter.toTravelerDTO(t));

		return res;
	}
}
