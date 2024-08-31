package com.cadastroGeral.cadastroGeral.repository;


import com.cadastroGeral.cadastroGeral.entity.InscricaoEstadual;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InscricaoEstadualRepository extends ListCrudRepository <InscricaoEstadual, Long> {
}
