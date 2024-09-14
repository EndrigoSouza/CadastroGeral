package com.cadastroGeral.cadastroGeral.controller;


import com.cadastroGeral.cadastroGeral.dto.TelefoneDTO;
import com.cadastroGeral.cadastroGeral.service.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/telefone")

public class TelefoneController {

    @Autowired
    TelefoneService service;

    @GetMapping
    public ResponseEntity<List<TelefoneDTO>> buscarTodos() {
        List<TelefoneDTO> telefone = service.findAll();
        return ResponseEntity.ok(telefone);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<TelefoneDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(@RequestBody TelefoneDTO telefoneDTO) {
        Long id = service.save(telefoneDTO);
        return ResponseEntity.ok("Telefone salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("Telefone deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(TelefoneDTO telefoneDTO) {
        Long id = service.save(telefoneDTO);
        return ResponseEntity.ok("Telefone atualizado com sucesso!");
    }
}
