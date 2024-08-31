package com.cadastroGeral.cadastroGeral.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InscricaoEstadual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="inscricao", length = 255)
    private String inscricao;

    @ManyToOne
    @JoinColumn(name = "pessoajuridica_id")
    private PessoaJuridica pessoajuridica;

    @ManyToOne
    @JoinColumn(name = "pessoafisica_id")
    private PessoaFisica pessoafisica;

    }
