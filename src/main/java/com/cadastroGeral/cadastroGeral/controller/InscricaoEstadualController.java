package com.cadastroGeral.cadastroGeral.controller;


import com.cadastroGeral.cadastroGeral.dto.InscricaoEstadualDTO;
import com.cadastroGeral.cadastroGeral.service.InscricaoEstadualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/inscricaoestadual")

public class InscricaoEstadualController {

    @Autowired
    InscricaoEstadualService service;

    @GetMapping
    public ResponseEntity<List<InscricaoEstadualDTO>> buscarTodos() {
        List<InscricaoEstadualDTO> inscricaoEstadual = service.findAll();
        return ResponseEntity.ok(inscricaoEstadual);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<InscricaoEstadualDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(InscricaoEstadualDTO inscricaoEstadualDTO) {
        Long id = service.save(inscricaoEstadualDTO);
        return ResponseEntity.ok("InscricaoEstadual salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("InscricaoEstadual deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(InscricaoEstadualDTO inscricaoEstadualDTO) {
        Long id = service.save(inscricaoEstadualDTO);
        return ResponseEntity.ok("InscricaoEstadual atualizado com sucesso!");
    }

}
