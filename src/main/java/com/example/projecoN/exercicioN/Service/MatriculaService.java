package com.example.projecoN.exercicioN.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.projecoN.exercicioN.Entity.Matricula;
import com.example.projecoN.exercicioN.Repository.AlunoRepository;
import com.example.projecoN.exercicioN.Repository.CursoRepository;
import com.example.projecoN.exercicioN.Repository.MatriculaRepository;

@Service
public class MatriculaService {
      private final MatriculaRepository matriculaRepository; 
      private final CursoRepository cursoRepository; 
      private final AlunoRepository alunoRepository;
    public MatriculaService(MatriculaRepository matriculaRepository,CursoRepository cursoRepository, AlunoRepository alunoRepository) {  
        this.matriculaRepository = matriculaRepository;
        this.cursoRepository = cursoRepository;
        this.alunoRepository = alunoRepository;
    }
    public List<Matricula> listarTodasMatriculas(){
        return matriculaRepository.findAll();
    }
    public Matricula salvMatricula(Matricula matricula){
        return matriculaRepository.save(matricula);
    }
}
