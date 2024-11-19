package com.example.Atividade15.DTO;

import com.example.Atividade15.models.Aluno;

import java.util.Set;

public record CursoDTO(String nome, String descricao, Set<Aluno> alunos){ }
