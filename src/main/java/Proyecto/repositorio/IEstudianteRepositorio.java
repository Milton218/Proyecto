package Proyecto.repositorio;


import Proyecto.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Long> {

    @Query("SELECT e FROM Estudiante e WHERE e.id_e LIKE %?1%"+
            "OR e.Nombre LIKE %?1%"+
            "OR e.Ru LIKE %?1%"
    )
    public List<Estudiante> findAll(String palabraClave);
}
