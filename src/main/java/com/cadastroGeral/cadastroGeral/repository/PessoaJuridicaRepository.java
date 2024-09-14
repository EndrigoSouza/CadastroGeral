package com.cadastroGeral.cadastroGeral.repository;

import com.cadastroGeral.cadastroGeral.entity.PessoaJuridica;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PessoaJuridicaRepository extends ListCrudRepository<PessoaJuridica, Long> {
}
