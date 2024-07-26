package com.example.minkia_pitittu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import jakarta.persistence.*;




@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "status")
    private String status;
    
    @Column(name = "total")
    private double total;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
   
    
}
