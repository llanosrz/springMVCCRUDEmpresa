package com.example.Empresa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Empresa.entities.Telefono;

public interface TelefonoDao extends JpaRepository<Telefono, Integer> {
    
}
