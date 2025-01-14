package com.generation.javago.controller;

import com.generation.javago.controller.helper.ControllerHelper;
import com.generation.javago.model.dto.TravelerDTOReq;
import com.generation.javago.model.dto.TravelerDTORespDetail;
import com.generation.javago.model.dto.TravelerDTORespSummary;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for managing travelers in the system.
 * Provides endpoints for retrieving, creating, and managing traveler data.
 */
@RestController
@RequestMapping("/api/travelers")
@Tag(name = "Traveler Management", description = "Endpoints for managing travelers")
public class TravelerController {

	@Autowired
	ControllerHelper ch;

	/**
	 * Retrieves a list of all travelers.
	 *
	 * @return a list of {@link TravelerDTORespSummary} objects summarizing traveler data.
	 */
	@Operation(summary = "Retrieve all travelers", description = "Returns a list of all travelers in the system.")
	@ApiResponse(responseCode = "200", description = "Successfully retrieved the list of travelers",
			content = @Content(mediaType = "application/json",
					schema = @Schema(implementation = TravelerDTORespSummary.class)))
	@GetMapping
	public List<TravelerDTORespSummary> getTravelers() {
		return ch.findAllTravelers();
	}

	/**
	 * Retrieves detailed information about a specific traveler by their ID.
	 *
	 * @param id the unique identifier of the traveler.
	 * @return a {@link TravelerDTORespDetail} object with detailed traveler data.
	 */
	@Operation(summary = "Retrieve traveler by ID", description = "Returns detailed information about a specific traveler.")
	@ApiResponse(responseCode = "200", description = "Traveler found",
			content = @Content(mediaType = "application/json",
					schema = @Schema(implementation = TravelerDTORespDetail.class)))
	@ApiResponse(responseCode = "404", description = "Traveler not found")
	@GetMapping("/{id}")
	public TravelerDTORespDetail getTraveler(@PathVariable("id") long id) {
		return ch.findTravelerById(id);
	}

	/**
	 * Creates a new traveler based on the provided request data.
	 *
	 * @param req the {@link TravelerDTOReq} object containing traveler details to be saved.
	 * @return a {@link TravelerDTORespSummary} object summarizing the created traveler.
	 */
	@Operation(summary = "Create a new traveler", description = "Creates a new traveler with the provided data.")
	@ApiResponse(responseCode = "201", description = "Traveler successfully created",
			content = @Content(mediaType = "application/json",
					schema = @Schema(implementation = TravelerDTORespSummary.class)))
	@RequestBody(description = "Traveler creation request", required = true,
			content = @Content(mediaType = "application/json",
					schema = @Schema(implementation = TravelerDTOReq.class)))
	@PostMapping
	public TravelerDTORespSummary createTraveler(@RequestBody TravelerDTOReq req) {
		return ch.saveTraveler(req);
	}
}
