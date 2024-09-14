package com.cadastroGeral.cadastroGeral.controller;


import com.cadastroGeral.cadastroGeral.dto.InscricaoMunicipalDTO;
import com.cadastroGeral.cadastroGeral.service.InscricaoMunicipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/inscricaomunicipal")


public class InscricaoMunicipalController {

    @Autowired
    InscricaoMunicipalService service;

    @GetMapping
    public ResponseEntity<List<InscricaoMunicipalDTO>> buscarTodos() {
        List<InscricaoMunicipalDTO> inscricaoMunicipal = service.findAll();
        return ResponseEntity.ok(inscricaoMunicipal);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<InscricaoMunicipalDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody InscricaoMunicipalDTO inscricaoMunicipalDTO) {
        Long id = service.save(inscricaoMunicipalDTO);
        return ResponseEntity.ok("InscricaoMunicipal salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("InscricaoMunicipal deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(InscricaoMunicipalDTO inscricaoMunicipalDTO) {
        Long id = service.save(inscricaoMunicipalDTO);
        return ResponseEntity.ok("InscricaoMunicipal atualizado com sucesso!");
    }
}
