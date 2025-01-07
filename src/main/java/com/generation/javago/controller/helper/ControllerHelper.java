package com.generation.javago.controller.helper;

import com.generation.javago.model.dto.PlaneTicketDTOReq;
import com.generation.javago.model.dto.PlaneTicketDTOResp;
import com.generation.javago.model.dto.TravelerDTOReq;
import com.generation.javago.model.dto.TravelerDTOResp;

public interface ControllerHelper
{
	PlaneTicketDTOResp findTicketById(long id);

	PlaneTicketDTOResp saveTicket(PlaneTicketDTOReq req);

	TravelerDTOResp findTravelerById(long id);

	TravelerDTOResp saveTraveler(TravelerDTOReq req);
}
