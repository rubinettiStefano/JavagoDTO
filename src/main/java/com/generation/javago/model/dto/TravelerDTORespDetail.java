package com.generation.javago.model.dto;

import java.util.ArrayList;
import java.util.List;

public class TravelerDTORespDetail
{
	private Long id;
	private String name, surname;
	private String address, email, phone, profession;
	private String dob;
	private List<PlaneTicketDTOResp> tickets = new ArrayList<>();

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getProfession()
	{
		return profession;
	}

	public void setProfession(String profession)
	{
		this.profession = profession;
	}

	public String getDob()
	{
		return dob;
	}

	public void setDob(String dob)
	{
		this.dob = dob;
	}

	public List<PlaneTicketDTOResp> getTickets()
	{
		return tickets;
	}

	public void setTickets(List<PlaneTicketDTOResp> tickets)
	{
		this.tickets = tickets;
	}

	public void addTicket(PlaneTicketDTOResp t)
	{
		this.tickets.add(t);
	}
}
