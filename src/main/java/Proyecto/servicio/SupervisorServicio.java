package Proyecto.servicio;

import Proyecto.model.Asistencia;
import Proyecto.model.Supervisor;
import Proyecto.repositorio.IAsistenciaRepositorio;
import Proyecto.repositorio.ISupervisorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorServicio {
    @Autowired
    private ISupervisorRepositorio supervisorRepositorio;

    public List<Supervisor> listAll(String palabraClave){
        if(palabraClave != null){
            return supervisorRepositorio.findAll(palabraClave);
        }
        return supervisorRepositorio.findAll();
    }
    public void save(Supervisor supervisor){ supervisorRepositorio.save(supervisor);}

    public Supervisor get(Long id_s){
        return supervisorRepositorio.findById(id_s).get();
    }

    public void delete(Long id_s){ supervisorRepositorio.deleteById(id_s);}
}
