package Proyecto.repositorio;

import Proyecto.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IHorarioRepositorio extends JpaRepository<Horario,Long> {
    @Query("SELECT h FROM Horario h WHERE h.id_h LIKE %?1%" +
            "OR h.Horarioscol LIKE %?1%"
                + "OR h.Aula_idAula LIKE %?1%"
            +"OR h.Fecha LIKE %?1%"
            +"OR h.Horario LIKE %?1%"
            +"OR h.Carrera LIKE %?1%"
            +"OR h.PlanAcademico LIKE %?1%"
            +"OR h.Materia LIKE %?1%"
            +"OR h.Docente LIKE %?1%"
            +"OR h.Semestre LIKE %?1%"
            + "OR h.Grupo LIKE %?1%")
    public List<Horario> findAll(String palabraClave);
}
