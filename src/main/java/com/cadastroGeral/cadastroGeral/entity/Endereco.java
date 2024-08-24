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
public class Endereco {

    @Id
    private Long id;
    private String cep;
    private String rua;
    private String numero;
    private String bairro;
    private String municipio;
    private String estado;
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "pessoajuridica_id")
    private PessoaJuridica pessoajuridica;

    @ManyToOne
    @JoinColumn(name = "pessoafisica_id")
    private Pessoafisica pessoaFisica;

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
