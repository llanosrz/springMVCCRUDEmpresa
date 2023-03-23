package com.example.Empresa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Empresa.entities.Empleado;

public interface EmpleadoDao extends JpaRepository<Empleado, Integer> {
    
}
