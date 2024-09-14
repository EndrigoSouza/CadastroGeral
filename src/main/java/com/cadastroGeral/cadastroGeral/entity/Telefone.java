package com.cadastroGeral.cadastroGeral.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="numero", length = 255)
    private String numero;
    @Column(name="tipo", length = 255)
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
