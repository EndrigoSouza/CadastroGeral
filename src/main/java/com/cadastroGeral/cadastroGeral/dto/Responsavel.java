package com.cadastroGeral.cadastroGeral.dto;

import org.springframework.data.annotation.Id;

public record Responsavel (


     Long id,
     String nome,
     String cpf
){
}
