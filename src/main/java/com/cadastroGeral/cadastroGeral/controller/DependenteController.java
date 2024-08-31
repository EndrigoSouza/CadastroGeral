package com.cadastroGeral.cadastroGeral.controller;



import com.cadastroGeral.cadastroGeral.dto.DependenteDTO;
import com.cadastroGeral.cadastroGeral.service.DependenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/dependente")

public class DependenteController {
    @Autowired
    DependenteService service;

@GetMapping
    public ResponseEntity<List<DependenteDTO>> buscarTodos() {
        List<DependenteDTO> dependente = service.findAll();
        return ResponseEntity.ok(dependente);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<DependenteDTO> buscarPorId(@PathVariable("id") Long id) {
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
    public ResponseEntity<String> update(DependenteDTO dependenteDTO) {
       Long id = service.save(dependenteDTO);
        return ResponseEntity.ok("Dependente atualizado com sucesso!");
    }


}
