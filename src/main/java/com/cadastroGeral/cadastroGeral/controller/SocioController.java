package com.cadastroGeral.cadastroGeral.controller;


import com.cadastroGeral.cadastroGeral.dto.SocioDTO;
import com.cadastroGeral.cadastroGeral.service.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/socio")

public class SocioController {

    @Autowired
    SocioService service;

    @GetMapping
    public ResponseEntity<List<SocioDTO>> buscarTodos() {
        List<SocioDTO> socio = service.findAll();
        return ResponseEntity.ok(socio);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<SocioDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody SocioDTO socioDTO) {
        Long id = service.save(socioDTO);
        return ResponseEntity.ok("Socio salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("Socio deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(SocioDTO socioDTO) {
        Long id = service.save(socioDTO);
        return ResponseEntity.ok("Socio atualizado com sucesso!");
    }
}
