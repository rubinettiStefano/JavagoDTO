package com.generation.javago.model.dto;

//P.O.J.O. Plain Old Java Object
public class PlaneTicketDTOReq
{
	private String startingAirport;
	private String landingAirport;
	private double price;
	private String takeOffTime;
	private Long travelerId;


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

	public Long getTravelerId()
	{
		return travelerId;
	}

	public void setTravelerId(Long travelerId)
	{
		this.travelerId = travelerId;
	}
}
