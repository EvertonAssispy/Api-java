package com.everton.Teste_Api_Psql.domain.coupons;
import java.time.LocalDate;
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


@Entity
@Table(name="Coupon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coupons {
    
    @Id
    @GeneratedValue
    private UUID id;

    private Integer discount;

    private LocalDate valid;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;


}