package com.cadastroGeral.cadastroGeral.repository;


import com.cadastroGeral.cadastroGeral.entity.Cliente;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends ListCrudRepository<Cliente, Long> {
}
