package com.cadastroGeral.cadastroGeral.service;


import com.cadastroGeral.cadastroGeral.dto.CnaeDTO;
import com.cadastroGeral.cadastroGeral.entity.Cnae;
import com.cadastroGeral.cadastroGeral.mapper.CnaeMapper;
import com.cadastroGeral.cadastroGeral.repository.CnaeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CnaeService {

    @Autowired
    private CnaeRepository repository;
    @Autowired
    private CnaeMapper mapper;


    public List<CnaeDTO> findAll() {
        List<Cnae> cnae = repository.findAll();
        return mapper.paraDTO(cnae);
    }
    /**
     Método responsável por retornar um cnae do cliente com base em um ID
     @param id ID na tabela cnae
     */


    public CnaeDTO findById(Long id) {
        Cnae cnae = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Cnae com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(cnae);

    }

    public Long save(CnaeDTO cnaeDTO) {
        Cnae cnae = mapper.paraEntity(cnaeDTO);
        return repository.save(cnae).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Cnae com id" + id + "Não foi encontrado");
        }
    }

    public Long update(CnaeDTO cnaeDTO) {
        Cnae cnae = mapper.paraEntity(cnaeDTO);
        if (repository.existsById(cnae.getId())) {
            return repository.save(cnae).getId();
        } else {
            throw new RuntimeException("Cnae com id" + cnae.getId() + "Não foi encontrado");
        }
    }
}
