package com.techcontrolmoz.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    private Integer id;
    private String nome;
    private List<Livro> livros =new ArrayList<>();

    
    
}
