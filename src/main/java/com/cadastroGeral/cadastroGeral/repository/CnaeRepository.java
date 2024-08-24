package com.cadastroGeral.cadastroGeral.repository;

import com.cadastroGeral.cadastroGeral.entity.Cnae;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CnaeRepository extends ListCrudRepository<Cnae, Long> {
}
