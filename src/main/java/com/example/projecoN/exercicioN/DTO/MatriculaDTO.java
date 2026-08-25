package com.example.projecoN.exercicioN.DTO;

import com.example.projecoN.exercicioN.Entity.Aluno;
import com.example.projecoN.exercicioN.Entity.Curso;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Data
public class MatriculaDTO {
    private Long id_curso;
    private Long id_aluno;
    private String dataMatricula;
    private String status;
  private Double notaFinal;
}
