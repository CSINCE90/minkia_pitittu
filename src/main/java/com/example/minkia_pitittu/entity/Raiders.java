package com.example.minkia_pitittu.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "RAIDERS")
public class Raiders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name="vehicle_type", nullable = false)
    private String vehicleType;
   
    
}
