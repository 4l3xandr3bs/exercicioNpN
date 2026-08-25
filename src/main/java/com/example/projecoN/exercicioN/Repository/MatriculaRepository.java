package com.example.projecoN.exercicioN.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.projecoN.exercicioN.Entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

    
}                           