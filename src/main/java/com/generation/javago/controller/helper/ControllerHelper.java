package com.generation.javago.controller.helper;

import com.generation.javago.controller.exception.EntityNotFoundException;
import com.generation.javago.model.dto.*;

import java.util.List;

/**
 * Contains all the logic of the application
 */
public interface ControllerHelper
{

	PlaneTicketDTOResp findTicketById(long id);

	/**
	 * Produce the detailed dto for a single Traveler with a specified id
	 *
	 * @param id , a positive integer
	 * @return TravelerDTORespDetail , a dto that represent all the fields of a Traveler, with all the children lists. Return null if there
	 * isn't a Traveler with the specified id
	 * @throws IllegalArgumentException , when id &lt; 1
	 */
	TravelerDTORespDetail findTravelerById(long id);

	PlaneTicketDTOResp saveTicket(PlaneTicketDTOReq req);

	TravelerDTORespSummary saveTraveler(TravelerDTOReq req);

	List<TravelerDTORespSummary> findAllTravelers();

	List<PlaneTicketDTOResp> findAllTickets();
}
