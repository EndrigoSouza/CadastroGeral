package com.cadastroGeral.cadastroGeral.service;



import com.cadastroGeral.cadastroGeral.dto.SocioDTO;
import com.cadastroGeral.cadastroGeral.entity.Socio;
import com.cadastroGeral.cadastroGeral.mapper.SocioMapper;
import com.cadastroGeral.cadastroGeral.repository.SocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class SocioService {
    @Autowired
    private SocioRepository repository;
    @Autowired
    private SocioMapper mapper;


    public List<SocioDTO> findAll() {
        List<Socio> socio = repository.findAll();
        return mapper.paraDTO(socio);
    }

    public SocioDTO findById(Long id) {
        Socio socio = repository.findById(id).orElseThrow(
                () -> new RuntimeException("Socio com id" + id + "Não foi encontrado"));
        return mapper.paraDTO(socio);

    }

    public Long save(SocioDTO socioDTO) {
        Socio socio = mapper.paraEntity(socioDTO);
        return repository.save(socio).getId();
    }

    public void delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Socio com id" + id + "Não foi encontrado");
        }
    }

    public Long update(SocioDTO socioDTO) {
        Socio socio = mapper.paraEntity(socioDTO);
        if (repository.existsById(socio.getId())) {
            return repository.save(socio).getId();
        } else {
            throw new RuntimeException("Socio com id" + socio.getId() + "Não foi encontrado");
        }
    }

}
