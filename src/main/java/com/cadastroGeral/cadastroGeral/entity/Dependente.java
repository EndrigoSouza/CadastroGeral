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
public class Dependente {

    /*
    verificar os campo que falta para poder preencher
    inserir no banco de dados
     */


    @Id
    private Long id;
    private String nome;
    private String cpf;
}
