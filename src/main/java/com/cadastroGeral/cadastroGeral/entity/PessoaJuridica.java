package com.cadastroGeral.cadastroGeral.entity;

import jakarta.persistence.*;
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
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    @Column(name="cnpj", length = 14)
     private String cnpj;
    @Column(name="razasocial", length = 255)
     private String razaosocial;
    @Column(name="nomefantasia", length = 255)
     private String nomefantasia;
    @Column(name="inscricaomunicipal", length = 20)
     private String inscricaomunicipal;
    @Column(name="inscricaoestadual", length = 20)
     private String inscricaoestadual;
    @Column(name="inicioatividade", length = 255)
     private LocalDate inicioatividade;
    @Column(name="email", length = 255)
     private String email;
}
