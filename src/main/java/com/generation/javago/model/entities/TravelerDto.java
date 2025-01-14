package com.generation.javago.model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * DTO for {@link Traveler}
 */
public class TravelerDto implements Serializable
{
	private final Long id;
	private final String name;
	private final String surname;
	private final String address;
	private final String email;
	private final String phone;
	private final String profession;
	private final LocalDate dob;

	public TravelerDto(Long id, String name, String surname, String address, String email, String phone, String profession, LocalDate dob)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.profession = profession;
		this.dob = dob;
	}

	public Long getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public String getSurname()
	{
		return surname;
	}

	public String getAddress()
	{
		return address;
	}

	public String getEmail()
	{
		return email;
	}

	public String getPhone()
	{
		return phone;
	}

	public String getProfession()
	{
		return profession;
	}

	public LocalDate getDob()
	{
		return dob;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		TravelerDto entity = (TravelerDto) o;
		return Objects.equals(this.id, entity.id) &&
				Objects.equals(this.name, entity.name) &&
				Objects.equals(this.surname, entity.surname) &&
				Objects.equals(this.address, entity.address) &&
				Objects.equals(this.email, entity.email) &&
				Objects.equals(this.phone, entity.phone) &&
				Objects.equals(this.profession, entity.profession) &&
				Objects.equals(this.dob, entity.dob);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id, name, surname, address, email, phone, profession, dob);
	}

	@Override
	public String toString()
	{
		return getClass().getSimpleName() + "(" +
				"id = " + id + ", " +
				"name = " + name + ", " +
				"surname = " + surname + ", " +
				"address = " + address + ", " +
				"email = " + email + ", " +
				"phone = " + phone + ", " +
				"profession = " + profession + ", " +
				"dob = " + dob + ")";
	}
}