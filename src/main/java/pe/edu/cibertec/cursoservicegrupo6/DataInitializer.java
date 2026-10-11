package pe.edu.cibertec.cursoservicegrupo6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.cibertec.cursoservicegrupo6.entity.Curso;
import pe.edu.cibertec.cursoservicegrupo6.repository.CursoRepository;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner cargarCursos(CursoRepository repository) {
        return args -> {
            if (repository.count() > 0) {
                return;
            }

            Curso curso1 = new Curso();
            curso1.setIdCurso(101L);
            curso1.setCodigoCurso("DAW2");
            curso1.setNombreCurso("Desarrollo de Aplicaciones Web II");
            curso1.setVacantesDisponibles(15);
            curso1.setPrerrequisito("Desarrollo de Aplicaciones Web I");
            curso1.setEstadoCurso("ABIERTO");
            curso1.setEstudianteId(1001L);
            curso1.setCreditos(4);
            curso1.setCostoPorCredito(120.0);
            repository.save(curso1);

            Curso curso2 = new Curso();
            curso2.setIdCurso(102L);
            curso2.setCodigoCurso("BD2");
            curso2.setNombreCurso("Base de Datos Avanzado II");
            curso2.setVacantesDisponibles(0);
            curso2.setPrerrequisito("Base de Datos Avanzado I");
            curso2.setEstadoCurso("CERRADO");
            curso2.setEstudianteId(1001L);
            curso2.setCreditos(3);
            curso2.setCostoPorCredito(120.0);
            repository.save(curso2);

            Curso curso3 = new Curso();
            curso3.setIdCurso(103L);
            curso3.setCodigoCurso("ARQ1");
            curso3.setNombreCurso("Arquitectura de Software");
            curso3.setVacantesDisponibles(10);
            curso3.setPrerrequisito("Programación Orientada a Objetos");
            curso3.setEstadoCurso("ABIERTO");
            curso3.setEstudianteId(1002L);
            curso3.setCreditos(4);
            curso3.setCostoPorCredito(120.0);
            repository.save(curso3);
        };
    }
}
