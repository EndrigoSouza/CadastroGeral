package com.cadastroGeral.cadastroGeral.repository;



import com.cadastroGeral.cadastroGeral.entity.Dependente;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DependenteRepository extends ListCrudRepository<Dependente, Long> {
}