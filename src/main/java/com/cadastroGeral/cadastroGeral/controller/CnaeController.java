package com.cadastroGeral.cadastroGeral.controller;

import com.cadastroGeral.cadastroGeral.dto.CnaeDTO;
import com.cadastroGeral.cadastroGeral.service.CnaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/cnae")

public class CnaeController {

    @Autowired
    CnaeService service;

    @GetMapping
    public ResponseEntity<List<CnaeDTO>> buscarTodos() {
        List<CnaeDTO> cnae = service.findAll();
        return ResponseEntity.ok(cnae);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<CnaeDTO> buscarPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @PostMapping
    public ResponseEntity<String> save(CnaeDTO cnaeDTO) {
        Long id = service.save(cnaeDTO);
        return ResponseEntity.ok("Cnae salvo com sucesso!");
    }
    @DeleteMapping
    public ResponseEntity<String> delete(Long id) {
        service.delete(id);
        return ResponseEntity.ok("Cnae deletado com sucesso!");
    }
    @PatchMapping
    public ResponseEntity<String> update(CnaeDTO cnaeDTO) {
        Long id = service.save(cnaeDTO);
        return ResponseEntity.ok("Cnae atualizado com sucesso!");
    }


}
