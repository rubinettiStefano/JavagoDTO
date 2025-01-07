package com.generation.javago.controller.helper;

import com.generation.javago.model.dto.PlaneTicketDTOReq;
import com.generation.javago.model.dto.PlaneTicketDTOResp;

public interface ControllerHelper
{
	PlaneTicketDTOResp findTicketById(long id);

	PlaneTicketDTOResp saveTicket(PlaneTicketDTOReq req);
}
