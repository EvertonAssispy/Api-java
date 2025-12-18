package com.everton.Teste_Api_Psql.repositorys;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everton.Teste_Api_Psql.domain.event.Event;


public interface eventRepository extends JpaRepository<Event, UUID> {  

}