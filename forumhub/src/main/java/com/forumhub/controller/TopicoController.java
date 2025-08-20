package com.forumhub.controller;

import com.forumhub.model.Topico;
import com.forumhub.service.TopicoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService service;

    @PostMapping
    @Transactional
    public ResponseEntity<Topico> criar(@RequestBody @Valid Topico topico) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(topico));
    }

    @GetMapping
    public List<Topico> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> detalhar(@PathVariable Long id) {
        return ResponseEntity.ok(service.detalhar(id));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Topico> atualizar(@PathVariable Long id, @RequestBody @Valid Topico topico) {
        return ResponseEntity.ok(service.atualizar(id, topico));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}