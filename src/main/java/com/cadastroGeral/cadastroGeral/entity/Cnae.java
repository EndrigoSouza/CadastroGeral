package com.cadastroGeral.cadastroGeral.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cnae")
public class Cnae {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="codigo", length = 255)
    private String codigo;

    @Column(name="descricao", length = 255)
    private String descricao;
}
