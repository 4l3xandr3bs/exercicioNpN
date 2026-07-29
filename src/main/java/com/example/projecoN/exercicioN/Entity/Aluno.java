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
@Table(name= "tb_aluno")
@Getter
@Setter
@NoArgsConstructor
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_aluno", nullable = false, unique = true)
    private Long id_aluno;
    @Column(name ="nome_aluno", nullable = false)
    private String nome_aluno;
    @Column(name ="cpf_aluno", nullable = false, unique = true, length = 11)
    private String cpf_aluno;
    @Column(name ="email_aluno", nullable = false, unique = true)
     private String email_aluno;


}