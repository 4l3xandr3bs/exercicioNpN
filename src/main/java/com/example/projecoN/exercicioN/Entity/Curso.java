package com.example.projecoN.exercicioN.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "tb_curso")
@Getter
@Setter
@NoArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_curso", nullable = false, unique = true)
    private Long id_curso;
    @Column(name ="nome_curso", nullable = false)
    private String nome_curso;
    @Column(name ="cargaHoraria", nullable = false)
    private Integer cargaHoraria;
    @Column(name ="descricaoCurso", nullable = false)
     private String descricaoCurso;

}
