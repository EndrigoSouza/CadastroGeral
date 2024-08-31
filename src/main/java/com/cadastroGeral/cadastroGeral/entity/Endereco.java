package com.cadastroGeral.cadastroGeral.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="cep", length = 255)
    private String cep;

    @Column(name="rua", length = 255)
    private String rua;

    @Column(name="numero", length = 255)
    private String numero;

    @Column(name="bairro", length = 255)
    private String bairro;

    @Column(name="municipio", length = 255)
    private String municipio;

    @Column(name="estado", length = 255)
    private String estado;

    @Column(name="complemento", length = 255)
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "pessoajuridica_id")
    private PessoaJuridica pessoajuridica;

    @ManyToOne
    @JoinColumn(name = "pessoafisica_id")
    private PessoaFisica pessoaFisica;

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
