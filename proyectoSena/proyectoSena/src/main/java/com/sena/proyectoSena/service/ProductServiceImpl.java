package com.sena.proyectoSena.service;
import com.sena.proyectoSena.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.proyectoSena.repository.ProductRepository;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository repository;
    @Override
    public List<Product> findAll(){
        return repository.findAll();
    }

    
}

