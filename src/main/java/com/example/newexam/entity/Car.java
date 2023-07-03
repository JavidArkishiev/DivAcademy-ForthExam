package com.example.newexam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "car")

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "number",nullable = false)
    private Integer number;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "price", nullable = false)
    private Integer price;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "manufacture_place", nullable = false)
    private String manufacture_place;


}
