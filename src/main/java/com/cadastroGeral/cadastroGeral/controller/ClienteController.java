package com.cadastroGeral.cadastroGeral.controller;

import com.cadastroGeral.cadastroGeral.dto.ClienteDTO;
import com.cadastroGeral.cadastroGeral.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/cliente")

public class ClienteController {

    @Autowired
    ClienteService service;

        @GetMapping
        public ResponseEntity<List<ClienteDTO>> buscarTodos() {
        List<ClienteDTO> cliente = service.findAll();
        return ResponseEntity.ok(cliente);
        }
        @GetMapping(value = "/{id}")
        public ResponseEntity<ClienteDTO> buscarPorId(@PathVariable("id") Long id) {
            return ResponseEntity.ok(service.findById(id));
        }
        @PostMapping
        public ResponseEntity<String> save(@RequestBody ClienteDTO clienteDTO) {
            Long id = service.save(clienteDTO);
            return ResponseEntity.ok("Cliente salvo com sucesso!");
        }
        @DeleteMapping
        public ResponseEntity<String> delete(Long id) {
            service.delete(id);
            return ResponseEntity.ok("Cliente deletado com sucesso!");
        }
        @PatchMapping
        public ResponseEntity<String> update(ClienteDTO clienteDTO) {
            Long id = service.save(clienteDTO);
            return ResponseEntity.ok("Cliente atualizado com sucesso!");
        }


}
