package com.example.cairocodes.portfolio;

import jakarta.persistence.*;

@Table(name = "projects")
@Entity(name = "projects")
public class Portfolio {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String description;

  // Construtores, getters e setters

  public Portfolio() {
  }

  public Portfolio(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Portfolio(PortfolioRequest data) {
    this.name = data.name();
    this.description = data.description();
  }
}
