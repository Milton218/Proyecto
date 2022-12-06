package Proyecto.repositorio;

import Proyecto.model.Horario;
import Proyecto.model.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ISupervisorRepositorio extends JpaRepository<Supervisor,Long> {
    @Query("SELECT s FROM Supervisor s WHERE s.NombreS LIKE %?1%" +
            "OR s.Password LIKE %?1%"
            +"OR s.Telefono LIKE %?1%")
    public List<Supervisor> findAll(String palabraClave);
}
