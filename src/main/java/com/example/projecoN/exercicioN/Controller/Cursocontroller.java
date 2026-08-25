package com.example.projecoN.exercicioN.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.projecoN.exercicioN.Entity.Aluno;
import com.example.projecoN.exercicioN.Entity.Curso;
import com.example.projecoN.exercicioN.Service.CursoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



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
      return "listarCurso";
  }
  @GetMapping("/cadastrarCurso")
  public String cadastrarCurso(Model oModel) {
    oModel.addAttribute("curso", new Curso());
      return "cadastrarCurso";
  }
  @PostMapping("/salvarC")
  public String salvarCurso(Curso oCurso) {
    cursoService.salvarCurso(oCurso);
      return "redirect:/Curso/listarCurso";
  }
  @GetMapping("/excluirC/{id}")
  public String excluirCurso(@PathVariable long id) {
     cursoService.deletarCurso(id);
      return "redirect:/Curso/listarCurso";
  }
  @GetMapping("/editarC/{id}")
 public String formAlterarCurso(@PathVariable Long id, Model oModel) {
  Curso cursoExistente = cursoService.buscarCursoPorId(id);
  oModel.addAttribute("curso", cursoExistente);
  return "cadastrarCurso";
}
  
  
}
