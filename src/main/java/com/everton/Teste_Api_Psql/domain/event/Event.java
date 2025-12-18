package com.everton.Teste_Api_Psql.domain.event;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name="event")  // Table so mapea para o nome da tabela
@Entity               // Entity diz/mostra que essa classe é uma entidade  
@Getter               //sao gerados os getters e setters de cada variavel  
@Setter
@NoArgsConstructor     // Sao construtores do lombok que faz receber todos os argumentos
@AllArgsConstructor         // para conseguir criar as instancias dessa classe
public class Event {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String description;

    private String imgUrl;

    private String eventUrl;

    private boolean remote;

    private LocalDate data;

}