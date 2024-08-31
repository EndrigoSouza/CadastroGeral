package com.cadastroGeral.cadastroGeral.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dependente")
public class Dependente {

    /*
    verificar os campo que falta para poder preencher
    inserir no banco de dados
     */


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome", length = 255)
    private String nome;

    @Column(name="cpf", length = 20)
    private String cpf;

    @Column(name="rg", length = 20)
    private String rg;

    @Column(name="cnh", length = 255)
    private String cnh;

}
