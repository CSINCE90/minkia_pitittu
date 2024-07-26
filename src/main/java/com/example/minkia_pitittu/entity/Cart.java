package com.example.minkia_pitittu.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "cart")

public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;    

    @Column(name="create_date")
    private Date createDate;

    
}
