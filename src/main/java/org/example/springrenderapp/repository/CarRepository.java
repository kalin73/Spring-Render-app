package org.example.springrenderapp.repository;

import org.example.springrenderapp.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
