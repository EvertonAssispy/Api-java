package com.everton.Teste_Api_Psql.domain.adress;
import java.util.UUID;

import com.everton.Teste_Api_Psql.domain.event.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Table(name="Adress")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adress {
    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;


    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;
    
}