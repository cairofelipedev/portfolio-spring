package com.example.cairocodes.controller;

import com.example.cairocodes.portfolio.Portfolio;
import com.example.cairocodes.portfolio.PortfolioRepository;
import com.example.cairocodes.portfolio.PortfolioRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("projects")

public class PortfolioController {

    @Autowired

    private PortfolioRepository repository;

    @PostMapping
    public ResponseEntity<String> saveFood(@RequestBody PortfolioRequest data) {
        Portfolio portfolioData = new Portfolio(data.name(), data.description());
        repository.save(portfolioData);

        // HTTP 201 (CREATED)
        return ResponseEntity.status(HttpStatus.CREATED).body("Projeto inserido com sucesso");
    }

    @GetMapping
    public List<Portfolio> getAll() {
        List<Portfolio> portfolioList = repository.findAll();
        return portfolioList;
    }
}
