package com.sena.proyectoSena.service;
import com.sena.proyectoSena.entity.Local;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.proyectoSena.repository.LocalRepository;

@Service
public class LocalServiceImpl implements LocalService{
    @Autowired
    LocalRepository repository;
    @Override
    public List<Local> findAll(){
        return repository.findAll();
    }

    
}
