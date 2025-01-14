package com.generation.javago.controller;

import com.generation.javago.controller.helper.ControllerHelper;
import com.generation.javago.model.dto.PlaneTicketDTOReq;
import com.generation.javago.model.dto.PlaneTicketDTOResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class PlaneTicketController
{

	@Autowired
	ControllerHelper ch;

	@GetMapping
	public List<PlaneTicketDTOResp> getAllTickets()
	{
		return ch.findAllTickets();
	}

	@GetMapping("/{id}")
	public PlaneTicketDTOResp getPlaneTicket(@PathVariable("id") long id)
	{
		return ch.findTicketById(id);
	}

	@PostMapping
	public PlaneTicketDTOResp createPlaneTicket(@RequestBody PlaneTicketDTOReq req)
	{
		return ch.saveTicket(req);
	}
}
