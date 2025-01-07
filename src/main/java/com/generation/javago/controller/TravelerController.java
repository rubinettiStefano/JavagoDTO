package com.generation.javago.controller;

import com.generation.javago.controller.helper.ControllerHelper;
import com.generation.javago.model.dto.TravelerDTOReq;
import com.generation.javago.model.dto.TravelerDTOResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/travelers")
public class TravelerController
{
	@Autowired
	ControllerHelper ch;

	@GetMapping("/{id}")
	public TravelerDTOResp getTraveler(@PathVariable("id") long id)
	{
		return ch.findTravelerById(id);
	}

	@PostMapping
	public TravelerDTOResp createTraveler(@RequestBody TravelerDTOReq req)
	{
		return ch.saveTraveler(req);
	}
}
