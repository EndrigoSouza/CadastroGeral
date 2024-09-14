package com.cadastroGeral.cadastroGeral.service;


import com.cadastroGeral.cadastroGeral.dto.ResponsavelDTO;
import com.cadastroGeral.cadastroGeral.entity.Responsavel;
import com.cadastroGeral.cadastroGeral.mapper.ResponsavelMapper;
import com.cadastroGeral.cadastroGeral.repository.ResponsavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public class ResponsavelService {

    @Autowired
    private ResponsavelRepository repository;
    @Autowired
    private ResponsavelMapper mapper;


    public List<ResponsavelDTO> findAll() {
        List<Responsavel> responsavel = repository.findAll();
        return mapper.paraDTO(responsavel);
    }

    public ResponsavelDTO findById(Long id) {
        Responsavel responsavel = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Responsavel com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(responsavel);

    }

    public Long save(ResponsavelDTO responsavelDTO) {
        Responsavel responsavel = mapper.paraEntity(responsavelDTO);
        return repository.save(responsavel).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Responsavel com id" + id + "Não foi encontrado");
        }
    }

    public Long update(ResponsavelDTO ResponsavelDTO) {
        Responsavel responsavel = mapper.paraEntity(ResponsavelDTO);
        if (repository.existsById(responsavel.getId())) {
            return repository.save(responsavel).getId();
        } else {
            throw new RuntimeException("Responsavel com id" + responsavel.getId() + "Não foi encontrado");
        }
    }
}


