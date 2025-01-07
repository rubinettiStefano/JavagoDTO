package com.generation.javago.model.dto;

public class TravelerDTORespSummary
{
	private Long id;
	private String name, surname;
	private String address, email, phone, profession;
	private String dob;
	private double totalSpending;
	private int numberOfTickets;

	public double getTotalSpending()
	{
		return totalSpending;
	}

	public void setTotalSpending(double totalSpending)
	{
		this.totalSpending = totalSpending;
	}

	public int getNumberOfTickets()
	{
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets)
	{
		this.numberOfTickets = numberOfTickets;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getDob()
	{
		return dob;
	}

	public void setDob(String dob)
	{
		this.dob = dob;
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
}
