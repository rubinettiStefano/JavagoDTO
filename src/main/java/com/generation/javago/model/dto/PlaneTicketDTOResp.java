package com.generation.javago.model.dto;

//P.O.J.O. Plain Old Java Object
public class PlaneTicketDTOResp
{
	private Long id;
	private String startingAirport;
	private String landingAirport;
	private double price;
	private String takeOffTime;
	private String travelerName;
	private String travelerSurname;
	private String travelerPhone;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
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

	public String getTakeOffTime()
	{
		return takeOffTime;
	}

	public void setTakeOffTime(String takeOffTime)
	{
		this.takeOffTime = takeOffTime;
	}

	public String getTravelerName()
	{
		return travelerName;
	}

	public void setTravelerName(String travelerName)
	{
		this.travelerName = travelerName;
	}

	public String getTravelerSurname()
	{
		return travelerSurname;
	}

	public void setTravelerSurname(String travelerSurname)
	{
		this.travelerSurname = travelerSurname;
	}

	public String getTravelerPhone()
	{
		return travelerPhone;
	}

	public void setTravelerPhone(String travelerPhone)
	{
		this.travelerPhone = travelerPhone;
	}
}
