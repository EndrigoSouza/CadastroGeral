package com.cadastroGeral.cadastroGeral.dto;

public record EnderecoDTO
        (

                Long id,
                String rua,
                String numero,
                String bairro,
                String cidade,
                String complemento,
                String estado,
                String cep )

{
}
