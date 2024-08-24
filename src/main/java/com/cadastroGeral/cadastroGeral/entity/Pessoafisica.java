package com.cadastroGeral.cadastroGeral.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pessoafisica {

    @Id
    private Long id;
    private String nome;
    private String rg;
    private String cnh;
    private String tituloeleitor;

}
