package com.cadastroGeral.cadastroGeral.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PessoaJuridica {

     @Id
    private Long id;
    private String cnpj;
    private String razaosocial;
    private String nomefantasia;
    private String inscricaomunicipal;
    private String inscricaoestadual;
    private LocalDate inicioatividade;
    private String email;
}
