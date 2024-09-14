package com.cadastroGeral.cadastroGeral.repository;




import com.cadastroGeral.cadastroGeral.entity.Socio;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface SocioRepository extends ListCrudRepository<Socio, Long> {
}
