package com.cadastroGeral.cadastroGeral.controller;


import com.cadastroGeral.cadastroGeral.dto.CnaeDTO;
import com.cadastroGeral.cadastroGeral.dto.DependenteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/dependente")

public class DependenteController {

    @Autowired
    Dependenteservice service;

    @GetMapping
    public ResponseEntity<List<DependenteDTO>> buscarTodos() {
        List<CnaeDTO> dependente = service.findAll();
        return ResponseEntity.ok(dependente);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<CnaeDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(DependenteDTO dependenteDTO) {
        Long id = service.save(dependenteDTO);
        return ResponseEntity.ok("Dependente salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("Dependente deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(CnaeDTO cnaeDTO) {
        Long id = service.save(cnaeDTO);
        return ResponseEntity.ok("Dependente atualizado com sucesso!");
    }


}
