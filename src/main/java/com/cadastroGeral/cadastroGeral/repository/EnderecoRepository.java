package com.cadastroGeral.cadastroGeral.repository;


import com.cadastroGeral.cadastroGeral.entity.Endereco;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface EnderecoRepository extends ListCrudRepository<Endereco, Long> {


    }
