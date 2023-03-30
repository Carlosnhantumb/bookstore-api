package com.techcontrolmoz.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techcontrolmoz.model.Livro;

@Repository
public interface LivrosRepository extends JpaRepository<Livro,Integer> {
    
}
