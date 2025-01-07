package com.generation.javago.model.repositories;

import com.generation.javago.model.entities.PlaneTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneTicketRepository extends JpaRepository<PlaneTicket, Long>
{
}
