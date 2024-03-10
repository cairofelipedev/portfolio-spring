package com.example.cairocodes.controller;

import com.example.cairocodes.portfolio.Portfolio;
import com.example.cairocodes.portfolio.PortfolioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("projects")
public class PortfolioController {

    @Autowired

    private PortfolioRepository repository;

    @GetMapping
    public List<Portfolio> getAll() {
        List<Portfolio> portfolioList = repository.findAll();
        return portfolioList;
    }
}
