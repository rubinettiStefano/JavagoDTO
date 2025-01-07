package com.generation.javago.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class PlaneTicket extends BaseEntity
{

	private LocalDateTime takeOffTime;
	private String startingAirport;
	private String landingAirport;
	private double price;

	@ManyToOne
	@JoinColumn(name = "traveler_id")
	private Traveler traveler;

	public LocalDateTime getTakeOffTime()
	{
		return takeOffTime;
	}

	public void setTakeOffTime(LocalDateTime takeOffTime)
	{
		this.takeOffTime = takeOffTime;
	}

	public String getStartingAirport()
	{
		return startingAirport;
	}

	public void setStartingAirport(String startingAirport)
	{
		this.startingAirport = startingAirport;
	}

	public String getLandingAirport()
	{
		return landingAirport;
	}

	public void setLandingAirport(String landingAirport)
	{
		this.landingAirport = landingAirport;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public Traveler getTraveler()
	{
		return traveler;
	}

	public void setTraveler(Traveler traveler)
	{
		this.traveler = traveler;
	}
}
