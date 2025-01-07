package com.generation.javago.model.repositories;

import com.generation.javago.model.entities.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelerRepository extends JpaRepository<Traveler, Long>
{
}
