package pe.edu.cibertec.cursoservicegrupo6.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.cursoservicegrupo6.dto.CursoDisponibilidadDTO;
import pe.edu.cibertec.cursoservicegrupo6.service.CursoService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cursos")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping("/{idCurso}")
    public ResponseEntity<CursoDisponibilidadDTO> obtenerCursoPorId(
            @PathVariable Long idCurso) {

        return ResponseEntity.ok(
                cursoService.obtenerCursoPorId(idCurso)
        );
    }

    @GetMapping("/estudiante/{estudianteId}")
    public ResponseEntity<List<CursoDisponibilidadDTO>>
    obtenerCursosPorEstudiante(
            @PathVariable Long estudianteId) {

        return ResponseEntity.ok(
                cursoService.obtenerCursosPorEstudiante(estudianteId)
        );
    }
}
