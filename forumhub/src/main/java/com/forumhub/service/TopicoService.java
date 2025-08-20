package com.forumhub.service;

import com.forumhub.model.Topico;
import com.forumhub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository repository;

    public Topico criar(Topico topico) {
        if (repository.existsByTituloAndMensagem(topico.getTitulo(), topico.getMensagem())) {
            throw new RuntimeException("Tópico duplicado");
        }
        topico.setDataCriacao(LocalDateTime.now());
        return repository.save(topico);
    }

    public List<Topico> listar() {
        return repository.findAll();
    }

    public Topico detalhar(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Tópico não encontrado"));
    }

    public Topico atualizar(Long id, Topico novoTopico) {
        Topico existente = detalhar(id);
        existente.setTitulo(novoTopico.getTitulo());
        existente.setMensagem(novoTopico.getMensagem());
        existente.setStatus(novoTopico.getStatus());
        existente.setAutor(novoTopico.getAutor());
        existente.setCurso(novoTopico.getCurso());
        return repository.save(existente);
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Tópico não encontrado");
        }
        repository.deleteById(id);
    }
}