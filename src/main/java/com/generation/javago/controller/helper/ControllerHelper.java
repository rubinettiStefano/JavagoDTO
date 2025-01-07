package com.generation.javago.controller.helper;

import com.generation.javago.model.dto.*;

import java.util.List;

public interface ControllerHelper
{
	PlaneTicketDTOResp findTicketById(long id);

	PlaneTicketDTOResp saveTicket(PlaneTicketDTOReq req);

	TravelerDTORespDetail findTravelerById(long id);

	TravelerDTORespSummary saveTraveler(TravelerDTOReq req);

	List<TravelerDTORespSummary> findAllTravelers();
}
