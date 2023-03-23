package com.example.Empresa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Empresa.entities.Departamento;

public interface DepartamentoDao extends JpaRepository<Departamento, Integer>{
    
}
