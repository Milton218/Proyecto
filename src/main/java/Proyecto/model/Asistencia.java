package Proyecto.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_a;


    @Column(nullable = false,length = 60)
    private String horario;
    @Column(nullable = false,length = 60)
    private String dia;
    @Column(nullable = false)
    private String fecha;
    @Column(nullable = false,length = 60)
    private String docente;
    @Column(nullable = false,length = 60)
    private String materia;
    @Column(nullable = false,length = 60)
    private String carrera;
    @Column(nullable = false,length = 60)
    private Integer paralelo;
    @Column(nullable = false,length = 60)
    private Integer semestre;
    @Column(nullable = false,length = 60)
    private Integer cantidad_estudiantes;
    @Column(nullable = false,length = 60)
    private String obs;
    @Column(nullable = false,length = 60)
    private String usuario_registro;

    public Asistencia(Long id_a, Integer permiso_id_p, Integer docente_id_d, String horario, String dia, String fecha, String docente, String materia, String carrera, Integer paralelo, Integer semestre, Integer cantidad_estudiantes, String obs, String usuario_registro) {
        this.id_a = id_a;
        this.horario = horario;
        this.dia = dia;
        this.fecha = fecha;
        this.docente = docente;
        this.materia = materia;
        this.carrera = carrera;
        this.paralelo = paralelo;
        this.semestre = semestre;
        this.cantidad_estudiantes = cantidad_estudiantes;
        this.obs = obs;
        this.usuario_registro = usuario_registro;
    }

    public Asistencia() {

    }

    public Long getId_a() {
        return id_a;
    }

    public void setId_a(Long id_a) {
        this.id_a = id_a;
    }




    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getParalelo() {
        return paralelo;
    }

    public void setParalelo(Integer paralelo) {
        this.paralelo = paralelo;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getCantidad_estudiantes() {
        return cantidad_estudiantes;
    }

    public void setCantidad_estudiantes(Integer cantidad_estudiantes) {
        this.cantidad_estudiantes = cantidad_estudiantes;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getUsuario_registro() {
        return usuario_registro;
    }

    public void setUsuario_registro(String usuario_registro) {
        this.usuario_registro = usuario_registro;
    }
}
