package com.techcontrolmoz.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techcontrolmoz.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer>{
    
}
