package com.docker.docker_test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.docker_test.dao.CityRepository;
import com.docker.docker_test.entity.City;

@RestController
@RequestMapping("/cities")
public class CityController {
    private final CityRepository cityRepository;

    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping
    public List<City> getAllCities() {
    	List<City> sehirler = cityRepository.findAll();
        return sehirler;
    }
}