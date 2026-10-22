package com.universidade.sistemauniversitario.repository;

import com.universidade.sistemauniversitario.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
    Aluno findByMatricula(String matricula);

    boolean existsByMatricula(String matricula);
}
