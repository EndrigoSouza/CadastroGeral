package com.cadastroGeral.cadastroGeral.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome", length = 255)
    private String nome;

    @Column(name="cpf", length = 255)
    private String cpf;

    @Column(name="sexo", length = 2)
    private Integer sexo;

    @Column(name="email", length = 255)
    private String email;

    @ManyToOne
    @JoinColumn(name = "telefone_id")
    private Telefone telefone;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
