package com.example.projecoN.exercicioN.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.projecoN.exercicioN.Entity.Aluno;
import com.example.projecoN.exercicioN.Entity.Curso;
import com.example.projecoN.exercicioN.Repository.CursoRepository;

@Service
public class CursoService {
    private final CursoRepository cursoRepository; 

    public CursoService(CursoRepository cursoRepository) {  
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarTodosCursos() {
       return cursoRepository.findAll();
    }

    public Curso buscarCursoPorId(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("curso não encontrado com o ID: " + id));
    }

    public Curso salvarCurso(Curso oCurso) {
        return cursoRepository.save(oCurso);
    }
    
    public Curso alterarCurso(Long id, Curso altCurso){
        Curso cursoExistente = buscarCursoPorId(id);
        cursoExistente.setNome_curso(altCurso.getNome_curso());
        cursoExistente.setCargaHoraria(altCurso.getCargaHoraria());
        cursoExistente.setDescricaoCurso(altCurso.getDescricaoCurso());
        return cursoRepository.save(cursoExistente);
    }

   public void deletarCurso(Long id){
        Curso CursoExistente = buscarCursoPorId(id);
        cursoRepository.delete(CursoExistente);
    }
}