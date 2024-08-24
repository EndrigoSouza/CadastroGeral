package com.cadastroGeral.cadastroGeral.dto;

import com.cadastroGeral.cadastroGeral.entity.Telefone;
import com.cadastroGeral.cadastroGeral.entity.Endereco;

public record ClienteDTO(
     Long id,
     String nome,
     String cpf,
     Integer sexo,
     String email,
     Telefone telefone,
     Endereco endereco
     )
 {

}
