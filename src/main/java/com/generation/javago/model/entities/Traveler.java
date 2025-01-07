package com.generation.javago.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Traveler extends BaseEntity
{
	private String name, surname;
	private String address, email, phone, profession;
	private LocalDate dob;


	@OneToMany(mappedBy = "traveler")
	private List<PlaneTicket> tickets = new ArrayList<>();

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

	public List<PlaneTicket> getTickets()
	{
		return tickets;
	}

	public void setTickets(List<PlaneTicket> tickets)
	{
		this.tickets = tickets;
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

	public LocalDate getDob()
	{
		return dob;
	}

	public void setDob(LocalDate dob)
	{
		this.dob = dob;
	}

	public int getAge()
	{
		return LocalDate.now().getYear() - dob.getYear();
	}
}
//D.T.O. Data Transfer Object
//Modelli per i json
//Entità <-> JSON        NO
//Entità <-> DTO <-> JSON