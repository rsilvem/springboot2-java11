package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Product;

@Repository // opcional pois ja herda de JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
