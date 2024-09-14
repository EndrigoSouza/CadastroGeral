package com.cadastroGeral.cadastroGeral.controller;


import com.cadastroGeral.cadastroGeral.dto.PessoaFisicaDTO;
import com.cadastroGeral.cadastroGeral.service.PessoaFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/pessoafisica")

public class PessoaFisicaController {

    @Autowired
    PessoaFisicaService service;

    @GetMapping
    public ResponseEntity<List<PessoaFisicaDTO>> buscarTodos() {
        List<PessoaFisicaDTO> pessoaFisica = service.findAll();
        return ResponseEntity.ok(pessoaFisica);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<PessoaFisicaDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody PessoaFisicaDTO pessoaFisicaDTO) {
        Long id = service.save(pessoaFisicaDTO);
        return ResponseEntity.ok("PessoaFisica salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("PessoaFisica deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(PessoaFisicaDTO PessoaFisicaDTO) {
        Long id = service.save(PessoaFisicaDTO);
        return ResponseEntity.ok("PessoaFisica atualizado com sucesso!");
    }
}
