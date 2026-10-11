package pe.edu.cibertec.cursoservicegrupo6.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pe.edu.cibertec.cursoservicegrupo6.dto.CursoDisponibilidadDTO;
import pe.edu.cibertec.cursoservicegrupo6.entity.Curso;
import pe.edu.cibertec.cursoservicegrupo6.repository.CursoRepository;

import java.util.List;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public CursoDisponibilidadDTO obtenerCursoPorId(Long idCurso) {
        Curso curso = cursoRepository.findById(idCurso)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "No existe el curso con ID " + idCurso
                ));

        return convertirADTO(curso);
    }

    public List<CursoDisponibilidadDTO> obtenerCursosPorEstudiante(
            Long estudianteId) {

        return cursoRepository.findByEstudianteId(estudianteId)
                .stream()
                .map(this::convertirADTO)
                .toList();
    }

    private CursoDisponibilidadDTO convertirADTO(Curso curso) {
        return new CursoDisponibilidadDTO(
                curso.getIdCurso(),
                curso.getCodigoCurso(),
                curso.getNombreCurso(),
                curso.getVacantesDisponibles(),
                curso.getPrerrequisito(),
                curso.getEstadoCurso()
        );
    }
}
