package com.lisbon.practice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lisbon.practice.model.RESTAURANTS;

@Repository
public interface RestaurantsRepository extends JpaRepository<RESTAURANTS, Long> {

	
}

