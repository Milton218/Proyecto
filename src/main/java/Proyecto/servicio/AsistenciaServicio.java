package Proyecto.servicio;


import Proyecto.model.Asistencia;
import Proyecto.model.Docente;
import Proyecto.model.Estudiante;
import Proyecto.repositorio.IAsistenciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciaServicio {
    @Autowired
    private IAsistenciaRepositorio asistenciaRepositorio;

    public List<Asistencia> listAll(String palabraClave){
        if(palabraClave != null){
            return asistenciaRepositorio.findAll(palabraClave);
        }
        return asistenciaRepositorio.findAll();
    }
    public void save(Asistencia asistencia){ asistenciaRepositorio.save(asistencia);}

    public Asistencia get(Long id_a){
        return asistenciaRepositorio.findById(id_a).get();
    }

    public void delete(Long id_a){ asistenciaRepositorio.deleteById(id_a);}
}
