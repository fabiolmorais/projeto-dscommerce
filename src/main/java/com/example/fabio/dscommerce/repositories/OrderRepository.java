package com.example.fabio.dscommerce.repositories;

import com.example.fabio.dscommerce.entities.Order;
import com.example.fabio.dscommerce.entities.User;
import com.example.fabio.dscommerce.projections.UserDetailsProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
