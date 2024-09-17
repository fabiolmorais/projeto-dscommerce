package com.example.fabio.dscommerce.services;

import com.example.fabio.dscommerce.dto.OrderDTO;
import com.example.fabio.dscommerce.dto.ProductDTO;
import com.example.fabio.dscommerce.entities.Order;
import com.example.fabio.dscommerce.entities.Product;
import com.example.fabio.dscommerce.repositories.OrderRepository;
import com.example.fabio.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}
