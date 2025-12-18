package com.everton.Teste_Api_Psql.repositorys;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everton.Teste_Api_Psql.domain.coupons.Coupons;


public interface couponsRepository extends JpaRepository<Coupons, UUID>{
    
}