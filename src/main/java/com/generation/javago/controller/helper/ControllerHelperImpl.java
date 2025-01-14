package com.generation.javago.controller.helper;

import com.generation.javago.controller.exception.EntityNotFoundException;
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
import java.util.Optional;

/**
 * Implements ......
 */
@Service
public class ControllerHelperImpl implements ControllerHelper
{
	@Autowired
	DTOConverter dtoConverter;
	@Autowired
	PlaneTicketRepository pRepo;
	@Autowired
	TravelerRepository tRepo;


	/**
	 * Finds a plane ticket by its unique identifier.
	 *
	 * @param id the unique identifier of the plane ticket; must be a positive number.
	 * @return an instance of PlaneTicketDTOResp containing the plane ticket details.
	 * @throws IllegalArgumentException if the provided id is less than or equal to 0.
	 * @throws EntityNotFoundException if no plane ticket is found with the given id.
	 */
	@Override
	public PlaneTicketDTOResp findTicketById(long id) throws IllegalArgumentException, EntityNotFoundException
	{
		if(id<=0)
			throw new IllegalArgumentException(id +" is not a valid id");

		Optional<PlaneTicket> pt = pRepo.findById(id);

		if(pt.isEmpty())
			throw new EntityNotFoundException("No plane ticket with id "+id+" found");

		return dtoConverter.toPlaneTicketDTO(pt.get());
	}


	@Override
	public TravelerDTORespDetail findTravelerById(long id) throws IllegalArgumentException
	{

		if(id<=0)
			throw new IllegalArgumentException(id +" is not a valid id");
		Optional<Traveler> t = tRepo.findById(id);

		if(t.isEmpty())
			return null;

		return dtoConverter.toTravelerDTODetail(t.get());
	}

	@Override
	public PlaneTicketDTOResp saveTicket(PlaneTicketDTOReq req)
	{

		PlaneTicket pt = dtoConverter.toPlaneTicket(req);
		pRepo.save(pt);
		return dtoConverter.toPlaneTicketDTO(pt);
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

	@Override
	public List<PlaneTicketDTOResp> findAllTickets()
	{
		return pRepo.findAll().stream().map(d-> dtoConverter.toPlaneTicketDTO(d)).toList();
	}
}
