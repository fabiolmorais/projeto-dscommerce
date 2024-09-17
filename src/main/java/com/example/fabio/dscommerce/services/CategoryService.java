package com.example.fabio.dscommerce.services;

import com.example.fabio.dscommerce.dto.CategoryDTO;
import com.example.fabio.dscommerce.dto.ProductDTO;
import com.example.fabio.dscommerce.dto.ProductMinDTO;
import com.example.fabio.dscommerce.entities.Category;
import com.example.fabio.dscommerce.entities.Product;
import com.example.fabio.dscommerce.repositories.CategoryRepository;
import com.example.fabio.dscommerce.repositories.ProductRepository;
import com.example.fabio.dscommerce.services.exceptions.DatabaseException;
import com.example.fabio.dscommerce.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(x -> new CategoryDTO(x)).toList();
    }

}
