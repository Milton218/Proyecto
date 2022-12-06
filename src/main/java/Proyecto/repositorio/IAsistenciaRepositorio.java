package Proyecto.repositorio;

import Proyecto.model.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAsistenciaRepositorio extends JpaRepository<Asistencia, Long> {

    @Query("SELECT a FROM Asistencia  a WHERE a.docente LIKE %?1%"+

            "OR a.cantidad_estudiantes LIKE %?1%"+
            "OR a.carrera LIKE %?1%"+
            "OR a.dia LIKE %?1%"+
            "OR a.fecha LIKE %?1%"+
            "OR a.horario LIKE %?1%"+
            "OR a.materia LIKE %?1%"+
            "OR a.obs LIKE %?1%"+
            "OR a.paralelo LIKE %?1%"+
            "OR a.semestre LIKE %?1%"+
            "OR a.usuario_registro LIKE %?1%")
    public List<Asistencia> findAll(String palabraClave);
}
