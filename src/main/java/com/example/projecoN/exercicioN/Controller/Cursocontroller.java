package com.example.projecoN.exercicioN.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.projecoN.exercicioN.Entity.Curso;
import com.example.projecoN.exercicioN.Service.CursoService;

@Controller
@RequestMapping("/Curso")
public class Cursocontroller {
     private final CursoService cursoService;
  public Cursocontroller(CursoService cursoService) {
    this.cursoService = cursoService;
  }
  @GetMapping("/listarCurso")
  public String listarTodosCursos(Model oModel) {
    oModel.addAttribute("listCursos", cursoService.listarTodosCursos());
      return new String();
  }
  @GetMapping("/cadastroCurso")
  public String cadastrarCurso(Model oModel) {
    oModel.addAttribute("curso", new Curso());
      return "cadastrarCurso";
  }
  @PostMapping("/salvarC")
  public String salvarCurso(Curso oCurso) {
    cursoService.salvarCurso(oCurso);
      return "redirect:/curso/listarCurso";
  }
  @PostMapping("/excluir")
  public String excluirCurso(@PathVariable long id) {
      cursoService.deletarCurso(id);
      
      return "redirect:/curso/listarCurso";
  }
  
}
