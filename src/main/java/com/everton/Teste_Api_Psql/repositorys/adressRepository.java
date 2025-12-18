package com.everton.Teste_Api_Psql.repositorys;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everton.Teste_Api_Psql.domain.adress.Adress;

public interface adressRepository extends JpaRepository<Adress, UUID> {
    
}