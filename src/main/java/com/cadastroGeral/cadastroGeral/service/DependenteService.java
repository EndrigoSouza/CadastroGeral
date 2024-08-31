package com.cadastroGeral.cadastroGeral.service;



import com.cadastroGeral.cadastroGeral.dto.DependenteDTO;
import com.cadastroGeral.cadastroGeral.entity.Dependente;
import com.cadastroGeral.cadastroGeral.mapper.DependenteMapper;
import com.cadastroGeral.cadastroGeral.repository.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DependenteService {

    @Autowired
    private DependenteRepository repository;
    @Autowired
    private DependenteMapper mapper;


    public List<DependenteDTO> findAll() {
        List<Dependente> dependentes = repository.findAll();
        return mapper.paraDTO(dependentes);
    }

    public DependenteDTO findById(Long id) {
        Dependente dependente = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Dependente com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(dependente);

    }

    public Long save(DependenteDTO dependenteDTO) {
        Dependente dependente = mapper.paraEntity(dependenteDTO);
        return repository.save(dependente).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Dependente com id" + id + "Não foi encontrado");
        }
    }

    public Long update(DependenteDTO dependenteDTO) {
        Dependente dependente = mapper.paraEntity(dependenteDTO);
        if (repository.existsById(dependente.getId())) {
            return repository.save(dependente).getId();
        } else {
            throw new RuntimeException("Dependente com id" + dependente.getId() + "Não foi encontrado");
        }
    }



}
