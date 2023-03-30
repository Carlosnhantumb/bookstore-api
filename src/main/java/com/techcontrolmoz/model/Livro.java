package com.techcontrolmoz.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {
    private Integer id;
    private String titulo;
    private String nome_autor;
    private String texto;
    private Categoria categoria;

}
