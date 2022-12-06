package Proyecto.repositorio;


import Proyecto.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDocenteRepositorio extends JpaRepository<Docente, Long> {

    @Query("SELECT d FROM Docente  d WHERE d.id_d LIKE %?1%"+
            "OR d.NombreDocente LIKE %?1%"+
            "OR d.Telefono LIKE %?1%"+
            "OR d.Correo LIKE %?1%"+
            "OR d.RU LIKE %?1%"
            )
    public List<Docente> findAll(String palabraClave);
}
