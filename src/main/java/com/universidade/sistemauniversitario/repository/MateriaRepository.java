
package com.universidade.sistemauniversitario.repository;

import com.universidade.sistemauniversitario.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MateriaRepository extends JpaRepository<Materia, Long> {

    Materia findByCodigo(String codigo);

    boolean existsByCodigo(String codigo);
}
