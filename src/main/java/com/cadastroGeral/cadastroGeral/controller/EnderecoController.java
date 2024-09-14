package com.cadastroGeral.cadastroGeral.controller;


import com.cadastroGeral.cadastroGeral.dto.EnderecoDTO;
import com.cadastroGeral.cadastroGeral.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/endereco")

public class EnderecoController {
    @Autowired
    EnderecoService service;

    @GetMapping
    public ResponseEntity<List<EnderecoDTO>> buscarTodos() {
        List<EnderecoDTO> endereco = service.findAll();
        return ResponseEntity.ok(endereco);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<EnderecoDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody EnderecoDTO enderecoDTO) {
        Long id = service.save(enderecoDTO);
        return ResponseEntity.ok("Endereco salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("Endereco deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(EnderecoDTO enderecoDTO) {
        Long id = service.save(enderecoDTO);
        return ResponseEntity.ok("Dependente atualizado com sucesso!");
    }



}
