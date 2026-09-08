package com.example.projecoN.exercicioN.Controller;

import com.example.projecoN.exercicioN.Service.AlunoService;
import com.example.projecoN.exercicioN.Service.CursoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.projecoN.exercicioN.DTO.MatriculaDTO;
import com.example.projecoN.exercicioN.Service.MatriculaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/matriculaCTR")
public class Matriculacontroller {
    private final CursoService cursoService;
    private final AlunoService alunoService;
    private final MatriculaService matriculaService;
    

    public Matriculacontroller(MatriculaService matriculaService,
            Cursocontroller cursocontroller,
            Alunocontroller alunocontroller, AlunoService oAlunoService, CursoService oCursoService) {
        this.matriculaService = matriculaService;
        this.cursoService = oCursoService;
        this.alunoService = oAlunoService;

    }

    @GetMapping("/listarMatriculas")
    public String listMatricula(Model oModel) {
        oModel.addAttribute("matriculas", matriculaService.listarTodasMatriculas());
        return "listarMatricula";
    }

    @GetMapping("/formCadastrarM")
    public String showFormCadastrarMatricula(Model oModel) {
        oModel.addAttribute("MariculaDTO", new MatriculaDTO());
        oModel.addAttribute("listAlunos", alunoService.listarTodosAlunos());
        oModel.addAttribute("listCursos", cursoService.listarTodosCursos());

        return "cadastrarMatricula";
    }

}
