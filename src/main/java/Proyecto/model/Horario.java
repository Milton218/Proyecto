package Proyecto.model;

import javax.persistence.*;

@Entity
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_h;
    @Column(nullable = false,length = 60)
    private String Horarioscol;
    @Column(nullable = false,length = 60)
    private String Aula_idAula;
    @Column(nullable = false,length = 60)
    private String Fecha;
    @Column(nullable = false,length = 60)
    private String Horario;
    @Column(nullable = false,length = 60)
    private String  Carrera;
    @Column(nullable = false,length = 60)
    private String PlanAcademico;
    @Column(nullable = false,length = 60)
    private String Materia;
    @Column(nullable = false,length = 60)
    private String Docente;
    @Column(nullable = false,length = 60)
    private String Semestre;
    @Column(nullable = false,length = 60)
    private String Grupo;

    public Horario() {

    }

    public Long getId_h() {
        return id_h;
    }

    public void setId_h(Long id_h) {
        this.id_h = id_h;
    }

    public String getHorarioscol() {
        return Horarioscol;
    }

    public void setHorarioscol(String horarioscol) {
        Horarioscol = horarioscol;
    }

    public String getAula_idAula() {
        return Aula_idAula;
    }

    public void setAula_idAula(String aula_idAula) {
        Aula_idAula = aula_idAula;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String horario) {
        Horario = horario;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public String getPlanAcademico() {
        return PlanAcademico;
    }

    public void setPlanAcademico(String planAcademico) {
        PlanAcademico = planAcademico;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String docente) {
        Docente = docente;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public Horario(Long id_h, String horarioscol, String aula_idAula, String fecha, String horario, String carrera, String planAcademico, String materia, String docente, String semestre, String grupo) {
        this.id_h = id_h;
        Horarioscol = horarioscol;
        Aula_idAula = aula_idAula;
        Fecha = fecha;
        Horario = horario;
        Carrera = carrera;
        PlanAcademico = planAcademico;
        Materia = materia;
        Docente = docente;
        Semestre = semestre;
        Grupo = grupo;
    }
}
