package com.cadastroGeral.cadastroGeral.controller;


import com.cadastroGeral.cadastroGeral.dto.ResponsavelDTO;
import com.cadastroGeral.cadastroGeral.service.ResponsavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/responsavel")

public class ResponsavelController {

    @Autowired
    ResponsavelService service;

    @GetMapping
    public ResponseEntity<List<ResponsavelDTO>> buscarTodos() {
        List<ResponsavelDTO> responsavel = service.findAll();
        return ResponseEntity.ok(responsavel);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<ResponsavelDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody ResponsavelDTO responsavelDTO) {
        Long id = service.save(responsavelDTO);
        return ResponseEntity.ok("Responsavel salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("Responsavel deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(ResponsavelDTO responsavelDTO) {
        Long id = service.save(responsavelDTO);
        return ResponseEntity.ok("Responsavel atualizado com sucesso!");
    }
}
