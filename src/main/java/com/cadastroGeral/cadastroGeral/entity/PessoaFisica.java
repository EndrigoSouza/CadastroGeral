package com.cadastroGeral.cadastroGeral.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome", length = 255)
    private String nome;
    @Column(name="rg", length = 255)
    private String rg;
    @Column(name="cnh", length = 255)
    private String cnh;
    @Column(name="ituloeleitor", length = 255)
    private String tituloeleitor;


}
