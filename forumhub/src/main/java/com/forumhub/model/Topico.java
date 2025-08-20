package com.forumhub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String titulo;

    @NotBlank
    private String mensagem;

    @NotNull
    private LocalDateTime dataCriacao;

    @NotBlank
    private String status;

    @NotBlank
    private String autor;

    @NotBlank
    private String curso;

    // Getters e Setters
}