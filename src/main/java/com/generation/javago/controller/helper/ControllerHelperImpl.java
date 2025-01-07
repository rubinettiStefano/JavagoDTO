package com.generation.javago.controller.helper;

import com.generation.javago.model.DTOConverter;
import com.generation.javago.model.dto.PlaneTicketDTOReq;
import com.generation.javago.model.dto.PlaneTicketDTOResp;
import com.generation.javago.model.entities.PlaneTicket;
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
}
