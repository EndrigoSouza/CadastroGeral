package com.cadastroGeral.cadastroGeral.repository;


import com.cadastroGeral.cadastroGeral.entity.Responsavel;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ResponsavelRepository extends ListCrudRepository<Responsavel, Long> {
}
