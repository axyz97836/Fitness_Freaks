package com.fitnessfreaks.backend.repository;

import com.fitnessfreaks.backend.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser_Id(Long userId);  // Note the underscore - this is the correct JPA method naming
}