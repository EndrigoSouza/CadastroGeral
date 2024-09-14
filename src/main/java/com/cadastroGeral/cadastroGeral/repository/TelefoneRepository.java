package com.cadastroGeral.cadastroGeral.repository;


import com.cadastroGeral.cadastroGeral.entity.Telefone;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TelefoneRepository extends ListCrudRepository<Telefone, Long> {
}
