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
public class Pessoajuridicacnae {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pessoajuricacnae_id")
    private Pessoajuridicacnae pessoajuridicacnae;

    @ManyToOne
    @JoinColumn(name = "cnae_id")
    private Cnae cnae;

}
