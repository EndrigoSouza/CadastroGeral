package com.cadastroGeral.cadastroGeral.service;


import com.cadastroGeral.cadastroGeral.dto.PessoaFisicaDTO;
import com.cadastroGeral.cadastroGeral.entity.PessoaFisica;
import com.cadastroGeral.cadastroGeral.mapper.PessoaFisicaMapper;
import com.cadastroGeral.cadastroGeral.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class PessoaFisicaService {

    @Autowired
    private PessoaFisicaRepository repository;
    @Autowired
    private PessoaFisicaMapper mapper;


    public List<PessoaFisicaDTO> findAll() {
        List<PessoaFisica> pessoaFisica = repository.findAll();
        return mapper.paraDTO(pessoaFisica);
    }

    public PessoaFisicaDTO findById(Long id) {
        PessoaFisica pessoaFisica = repository.findById(id).orElseThrow(
                () -> new RuntimeException("PessoaFisica com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(pessoaFisica);

    }

    public Long save(PessoaFisicaDTO pessoaFisicaDTO) {
        PessoaFisica pessoaFisica = mapper.paraEntity(pessoaFisicaDTO);
        return repository.save(pessoaFisica).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("PessoaFisica com id" + id + "Não foi encontrado");
        }
    }

    public Long update(PessoaFisicaDTO pessoaFisicaDTO) {
        PessoaFisica pessoaFisica = mapper.paraEntity(pessoaFisicaDTO);
        if (repository.existsById(pessoaFisica.getId())) {
            return repository.save(pessoaFisica).getId();
        } else {
            throw new RuntimeException("PessoaFisica com id" + pessoaFisica.getId() + "Não foi encontrado");
        }
    }
}
