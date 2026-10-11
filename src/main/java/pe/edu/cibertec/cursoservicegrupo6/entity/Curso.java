package pe.edu.cibertec.cursoservicegrupo6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    private Long idCurso;

    private String codigoCurso;
    private String nombreCurso;
    private Integer vacantesDisponibles;
    private String prerrequisito;
    private String estadoCurso;

    private Long estudianteId;
    private Integer creditos;
    private Double costoPorCredito;

    public Curso() {
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getVacantesDisponibles() {
        return vacantesDisponibles;
    }

    public void setVacantesDisponibles(Integer vacantesDisponibles) {
        this.vacantesDisponibles = vacantesDisponibles;
    }

    public String getPrerrequisito() {
        return prerrequisito;
    }

    public void setPrerrequisito(String prerrequisito) {
        this.prerrequisito = prerrequisito;
    }

    public String getEstadoCurso() {
        return estadoCurso;
    }

    public void setEstadoCurso(String estadoCurso) {
        this.estadoCurso = estadoCurso;
    }

    public Long getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(Long estudianteId) {
        this.estudianteId = estudianteId;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Double getCostoPorCredito() {
        return costoPorCredito;
    }

    public void setCostoPorCredito(Double costoPorCredito) {
        this.costoPorCredito = costoPorCredito;
    }
}
