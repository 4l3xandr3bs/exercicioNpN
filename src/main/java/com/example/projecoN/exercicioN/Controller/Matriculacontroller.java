package com.example.projecoN.exercicioN.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.projecoN.exercicioN.Service.MatriculaService;

@Controller 
@RequestMapping ("/matriculaCTR")
public class Matriculacontroller {
    private final MatriculaService matriculaService;
    private final Cursocontroller cursocontroller;
    private final Alunocontroller alunocontroller;
    public Matriculacontroller(MatriculaService matriculaService,
         Cursocontroller cursocontroller,
          Alunocontroller alunocontroller){
    this.matriculaService = matriculaService;
    this.alunocontroller = alunocontroller;
    this.cursocontroller = cursocontroller;
    }

}
