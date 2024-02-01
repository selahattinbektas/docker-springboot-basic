package com.docker.docker_test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.docker_test.entity.City;

public interface CityRepository extends JpaRepository<City, Long> {
}
