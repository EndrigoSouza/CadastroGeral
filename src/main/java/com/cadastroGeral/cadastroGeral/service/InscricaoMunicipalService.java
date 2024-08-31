package com.cadastroGeral.cadastroGeral.service;



import com.cadastroGeral.cadastroGeral.dto.InscricaoMunicipalDTO;
import com.cadastroGeral.cadastroGeral.entity.InscricaoMunicipal;
import com.cadastroGeral.cadastroGeral.mapper.InscricaoMunicipalMapper;
import com.cadastroGeral.cadastroGeral.repository.InscricaoMunicipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class InscricaoMunicipalService {

    @Autowired
    private InscricaoMunicipalRepository repository;
    @Autowired
    private InscricaoMunicipalMapper mapper;


    public List<InscricaoMunicipalDTO> findAll() {
        List<InscricaoMunicipal> inscricaoMunicipal = repository.findAll();
        return mapper.paraDTO(inscricaoMunicipal);
    }

    public InscricaoMunicipalDTO findById(Long id) {
        InscricaoMunicipal inscricaoMunicipal = repository.findById(id).orElseThrow(
                () -> new RuntimeException("InscricaoEstadual com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(inscricaoMunicipal);

    }

    public Long save(InscricaoMunicipalDTO inscricaoMunicipalDTO) {
        InscricaoMunicipal inscricaoMunicipal = mapper.paraEntity(inscricaoMunicipalDTO);
        return repository.save(inscricaoMunicipal).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("InscricaoMunicipal com id" + id + "Não foi encontrado");
        }
    }

    public Long update(InscricaoMunicipalDTO inscricaoMunicipalDTO) {
        InscricaoMunicipal inscricaoMunicipal = mapper.paraEntity(inscricaoMunicipalDTO);
        if (repository.existsById(inscricaoMunicipal.getId())) {
            return repository.save(inscricaoMunicipal).getId();
        } else {
            Thread inscricaMunicipal;
            throw new RuntimeException("InscricaoMunicipal com id" + inscricaoMunicipal.getId() + "Não foi encontrado");
        }
    }
}
