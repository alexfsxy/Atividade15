package com.example.Atividade15.DTO;

import com.example.Atividade15.models.Curso;

import java.util.Set;

public record AlunoDTO(String nome, String email, Set<Curso> cursos) { }
