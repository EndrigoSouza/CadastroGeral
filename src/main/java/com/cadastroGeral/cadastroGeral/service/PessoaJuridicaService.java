package com.cadastroGeral.cadastroGeral.service;


import com.cadastroGeral.cadastroGeral.dto.PessoaJuridicaDTO;
import com.cadastroGeral.cadastroGeral.entity.PessoaJuridica;
import com.cadastroGeral.cadastroGeral.mapper.PessoaJuridicaMapper;
import com.cadastroGeral.cadastroGeral.repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class PessoaJuridicaService {

    @Autowired
    private PessoaJuridicaRepository repository;
    @Autowired
    private PessoaJuridicaMapper mapper;


    public List<PessoaJuridicaDTO> findAll() {
        List<PessoaJuridica> pessoaJuridica = repository.findAll();
        return mapper.paraDTO(pessoaJuridica);
    }

    public PessoaJuridicaDTO findById(Long id) {
        PessoaJuridica pessoaJuridica = repository.findById(id).orElseThrow(
                () -> new RuntimeException("PessoaJuridica com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(pessoaJuridica);

    }

    public Long save(PessoaJuridicaDTO pessoaJuridicaDTO) {
        PessoaJuridica pessoaJuridica = mapper.paraEntity(pessoaJuridicaDTO);
        return repository.save(pessoaJuridica).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("PessoaJuridica com id" + id + "Não foi encontrado");
        }
    }

    public Long update(PessoaJuridicaDTO pessoaJuridicaDTO) {
        PessoaJuridica pessoaJuridica = mapper.paraEntity(pessoaJuridicaDTO);
        if (repository.existsById(pessoaJuridica.getId())) {
            return repository.save(pessoaJuridica).getId();
        } else {
            throw new RuntimeException("PessoaFisica com id" + pessoaJuridica.getId() + "Não foi encontrado");
        }
    }


}
