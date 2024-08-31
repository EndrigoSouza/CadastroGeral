package com.cadastroGeral.cadastroGeral.repository;


import com.cadastroGeral.cadastroGeral.entity.PessoaFisica;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PessoaFisicaRepository extends ListCrudRepository<PessoaFisica, Long> {
}
