package pe.edu.cibertec.cursoservicegrupo6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.cursoservicegrupo6.entity.Curso;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByEstudianteId(Long estudianteId);
}
