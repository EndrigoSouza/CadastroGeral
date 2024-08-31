package com.cadastroGeral.cadastroGeral.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Telefone {

    @Id
    private Long id;
    private String numero;
    private Integer tipo;

    @ManyToOne
    @JoinColumn(name = "pessoajuridica_id")
    private PessoaJuridica pessoajuridica;

    @ManyToOne
    @JoinColumn(name = "pessoafisica_id")
    private PessoaFisica pessoafisica;

    @ManyToOne
    @JoinColumn(name = "dependente_id")
    private Dependente dependente;

    @ManyToOne
    @JoinColumn(name = "socio_id")
    private Socio socio;

    @ManyToOne
    @JoinColumn(name = "responsavel_id")
    private Responsavel responsavel;


}
