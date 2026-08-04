package com.example.projecoN.exercicioN.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.projecoN.exercicioN.Entity.Aluno;
import com.example.projecoN.exercicioN.Service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/aluno")
public class Alunocontroller {
  private final AlunoService alunoService;
  public Alunocontroller(AlunoService alunoService) {
    this.alunoService = alunoService;
  }
    @GetMapping("/listarTodos")
    public String listarTodosAlunos(Model oModel) {
        oModel.addAttribute("listAlunos", alunoService.listarTodosAlunos());
        return "listarAluno";
    }
    @GetMapping("/formCadastrar")
    public String formCadastro(Model oModel) {
        oModel.addAttribute("aluno",new Aluno());
        return "cadastrarAluno";
    }
    @PostMapping("/salvar")
    public String salvarAluno(Aluno oAluno) {
        alunoService.salvarAluno(oAluno);
        return "redirect:/aluno/listarTodos";
    }
    
}
