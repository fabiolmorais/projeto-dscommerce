package com.example.fabio.dscommerce.repositories;

import com.example.fabio.dscommerce.entities.Order;
import com.example.fabio.dscommerce.entities.OrderItem;
import com.example.fabio.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
