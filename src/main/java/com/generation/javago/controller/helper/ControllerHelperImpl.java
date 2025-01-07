package com.generation.javago.controller.helper;

import com.generation.javago.model.DTOConverter;
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
	public TravelerDTOResp findTravelerById(long id)
	{
		Traveler t = tRepo.findById(id).get();
		return dtoConverter.toTravelerDTO(t);
	}

	@Override
	public TravelerDTOResp saveTraveler(TravelerDTOReq req)
	{
		Traveler t = dtoConverter.toTraveler(req);
		tRepo.save(t);
		return dtoConverter.toTravelerDTO(t);
	}
}
