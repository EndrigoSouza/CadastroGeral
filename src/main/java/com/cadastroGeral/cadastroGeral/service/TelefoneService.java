package com.cadastroGeral.cadastroGeral.service;



import com.cadastroGeral.cadastroGeral.dto.TelefoneDTO;
import com.cadastroGeral.cadastroGeral.entity.Telefone;
import com.cadastroGeral.cadastroGeral.mapper.TelefoneMapper;
import com.cadastroGeral.cadastroGeral.repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class TelefoneService {

    @Autowired
    private TelefoneRepository repository;
    @Autowired
    private TelefoneMapper mapper;


    public List<TelefoneDTO> findAll() {
        List<Telefone> telefone = repository.findAll();
        return mapper.paraDTO(telefone);
    }

    /**
     Método responsável por retornar um telefone  de todos que ultilizao telefone acima
     com base em um ID
     @param id ID na tabela telefone
     */

    public TelefoneDTO findById(Long id) {
        Telefone telefone = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Telefone com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(telefone);

    }

    public Long save(TelefoneDTO telefoneDTO) {
        Telefone telefone = mapper.paraEntity(telefoneDTO);
        return repository.save(telefone).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Telefone com id" + id + "Não foi encontrado");
        }
    }

    public Long update(TelefoneDTO telefoneDTO) {
        Telefone telefone = mapper.paraEntity(telefoneDTO);
        if (repository.existsById(telefone.getId())) {
            return repository.save(telefone).getId();
        } else {
            throw new RuntimeException("Telefone com id" + telefone.getId() + "Não foi encontrado");
        }
    }
}
