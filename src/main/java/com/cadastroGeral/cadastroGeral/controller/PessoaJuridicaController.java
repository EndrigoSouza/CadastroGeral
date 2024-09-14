package com.cadastroGeral.cadastroGeral.controller;


import com.cadastroGeral.cadastroGeral.dto.PessoaJuridicaDTO;
import com.cadastroGeral.cadastroGeral.service.PessoaJuridicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/pessoajuridica")

public class PessoaJuridicaController {

    @Autowired
    PessoaJuridicaService service;

    @GetMapping
    public ResponseEntity<List<PessoaJuridicaDTO>> buscarTodos() {
        List<PessoaJuridicaDTO> pessoaJuridica = service.findAll();
        return ResponseEntity.ok(pessoaJuridica);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<PessoaJuridicaDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody PessoaJuridicaDTO pessoaJuridicaDTO) {
        Long id = service.save(pessoaJuridicaDTO);
        return ResponseEntity.ok("PessoaJuridica salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("PessoaJuridica deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(PessoaJuridicaDTO pessoaJuridicaDTO) {
        Long id = service.save(pessoaJuridicaDTO);
        return ResponseEntity.ok("PessoaJuridica atualizado com sucesso!");
    }
}
