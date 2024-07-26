package com.example.minkia_pitittu.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import jakarta.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "deliveries")
public class Deliveries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;
    @ManyToOne
    @JoinColumn(name = "raider_id")
    private Raiders raiders;
    @Column(name = "delivery_date")
    private Date deliveryDate;
    @Column(name = "delivery_status")
    private String deliveryStatus;
    
}
