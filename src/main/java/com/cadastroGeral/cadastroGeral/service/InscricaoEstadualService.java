package com.cadastroGeral.cadastroGeral.service;


import com.cadastroGeral.cadastroGeral.dto.InscricaoEstadualDTO;
import com.cadastroGeral.cadastroGeral.entity.InscricaoEstadual;
import com.cadastroGeral.cadastroGeral.mapper.InscricaoEstadualMapper;
import com.cadastroGeral.cadastroGeral.repository.InscricaoEstadualRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class InscricaoEstadualService {

    @Autowired
    private InscricaoEstadualRepository repository;
    @Autowired
    private InscricaoEstadualMapper mapper;


    public List<InscricaoEstadualDTO> findAll() {
        List<InscricaoEstadual> inscricaoEstadual = repository.findAll();
        return mapper.paraDTO(inscricaoEstadual);
    }


    /**
     Método responsável por retornar um inscricaoEstadual de uma pessoa fisica e juridica com base em um ID
     @param id ID na tabela inscricaoEstadual
     */

    public InscricaoEstadualDTO findById(Long id) {
        InscricaoEstadual inscricaoEstadual = repository.findById(id).orElseThrow(
                () -> new RuntimeException("InscricaoEstadual com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(inscricaoEstadual);

    }

    public Long save(InscricaoEstadualDTO inscricaoEstadualDTO) {
        InscricaoEstadual inscricaoEstadual = mapper.paraEntity(inscricaoEstadualDTO);
        return repository.save(inscricaoEstadual).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("InscricaoEstadual com id" + id + "Não foi encontrado");
        }
    }

    public Long update(InscricaoEstadualDTO inscricaoEstadualDTO) {
        InscricaoEstadual inscricaoEstadual = mapper.paraEntity(inscricaoEstadualDTO);
        if (repository.existsById(inscricaoEstadual.getId())) {
            return repository.save(inscricaoEstadual).getId();
        } else {
            throw new RuntimeException("InscricaoEstadual com id" + inscricaoEstadual.getId() + "Não foi encontrado");
        }
    }
}
