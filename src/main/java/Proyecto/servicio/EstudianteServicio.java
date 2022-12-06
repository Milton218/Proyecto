package Proyecto.servicio;


import Proyecto.model.Estudiante;

import Proyecto.repositorio.IEstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicio {
    @Autowired
    private IEstudianteRepositorio estudianteRepositorio;

    public List<Estudiante> listAll(String palabraClave){
        if(palabraClave != null){
            return estudianteRepositorio.findAll(palabraClave);
        }
        return estudianteRepositorio.findAll();

    }

    public void save(Estudiante estudiante){
        estudianteRepositorio.save(estudiante);
    }

    public Estudiante get(Long id_e){
        return estudianteRepositorio.findById(id_e).get();
    }

    public void delete(Long id_e){
        estudianteRepositorio.deleteById(id_e);
    }
}
