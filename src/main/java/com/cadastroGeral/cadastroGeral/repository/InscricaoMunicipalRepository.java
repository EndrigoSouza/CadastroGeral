package com.cadastroGeral.cadastroGeral.repository;



import com.cadastroGeral.cadastroGeral.entity.InscricaoMunicipal;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InscricaoMunicipalRepository extends ListCrudRepository<InscricaoMunicipal, Long> {
}
