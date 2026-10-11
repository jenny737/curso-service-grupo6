package pe.edu.cibertec.cursoservicegrupo6.dto;

public class CursoDisponibilidadDTO {
    private Long idCurso;
    private String codigoCurso;
    private String nombreCurso;
    private Integer vacantesDisponibles;
    private String prerrequisito;
    private String estadoCurso;

    public CursoDisponibilidadDTO() {
    }

    public CursoDisponibilidadDTO(
            Long idCurso,
            String codigoCurso,
            String nombreCurso,
            Integer vacantesDisponibles,
            String prerrequisito,
            String estadoCurso) {
        this.idCurso = idCurso;
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.vacantesDisponibles = vacantesDisponibles;
        this.prerrequisito = prerrequisito;
        this.estadoCurso = estadoCurso;
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
}
