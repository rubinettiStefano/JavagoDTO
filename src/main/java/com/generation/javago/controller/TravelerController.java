package com.generation.javago.controller;

import com.generation.javago.controller.helper.ControllerHelper;
import com.generation.javago.model.dto.TravelerDTOReq;
import com.generation.javago.model.dto.TravelerDTORespDetail;
import com.generation.javago.model.dto.TravelerDTORespSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travelers")
public class TravelerController
{
	@Autowired
	ControllerHelper ch;

	@GetMapping
	public List<TravelerDTORespSummary> getTravelers()
	{
		return ch.findAllTravelers();
	}


	@GetMapping("/{id}")
	public TravelerDTORespDetail getTraveler(@PathVariable("id") long id)
	{
		return ch.findTravelerById(id);
	}

	@PostMapping
	public TravelerDTORespSummary createTraveler(@RequestBody TravelerDTOReq req)
	{
		return ch.saveTraveler(req);
	}
}
