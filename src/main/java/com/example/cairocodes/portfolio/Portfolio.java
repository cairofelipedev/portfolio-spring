package com.example.cairocodes.portfolio;

import jakarta.persistence.*;

@Table(name = "projects")
@Entity(name = "projects")

public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;
}
