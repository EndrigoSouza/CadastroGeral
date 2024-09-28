package com.cadastroGeral.cadastroGeral.service;


import com.cadastroGeral.cadastroGeral.dto.EnderecoDTO;
import com.cadastroGeral.cadastroGeral.entity.Endereco;
import com.cadastroGeral.cadastroGeral.mapper.EnderecoMapper;
import com.cadastroGeral.cadastroGeral.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;
    @Autowired
    private EnderecoMapper mapper;


    public List<EnderecoDTO> findAll() {
        List<Endereco> endereco = repository.findAll();
        return mapper.paraDTO(endereco);
    }

    public EnderecoDTO findById(Long id) {
        Endereco endereco = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Endereco com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(endereco);

    }
    /**
     Método responsável por retornar um Endereço a pessoa juridica, pessoa fisica, cliente,dependentes,socios, tudo ligado
     com base em um ID
     @param id ID na tabela Endereco
     */



    public Long save(EnderecoDTO enderecoDTO) {
       Endereco endereco = mapper.paraEntity(enderecoDTO);
        return repository.save(endereco).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Endereco com id" + id + "Não foi encontrado");
        }
    }

    public Long update(EnderecoDTO enderecoDTO) {
        Endereco endereco = mapper.paraEntity(enderecoDTO);
        if (repository.existsById(endereco.getId())) {
            return repository.save(endereco).getId();
        } else {
            throw new RuntimeException("Endereco com id" + endereco.getId() + "Não foi encontrado");
        }
    }

}








