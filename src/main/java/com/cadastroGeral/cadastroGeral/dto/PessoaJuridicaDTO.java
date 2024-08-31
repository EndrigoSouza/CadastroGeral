package com.cadastroGeral.cadastroGeral.dto;

import java.time.LocalDate;

public record PessoaJuridicaDTO(

        Long id,
        String cnpj,
        String razaosocial,
        String nomefantasia,
        String inscricaomunicipal,
        String inscricaoestadual,
        LocalDate inicioatividade,
        String email
) {
}
