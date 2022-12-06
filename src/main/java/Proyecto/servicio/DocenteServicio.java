package Proyecto.servicio;


import Proyecto.model.Docente;
import Proyecto.repositorio.IDocenteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DocenteServicio {
    @Autowired
    private IDocenteRepositorio docenteRepositorio;

    public List<Docente> listAll(String palabraClave){
        if(palabraClave != null){
            return docenteRepositorio.findAll(palabraClave);
        }
        return docenteRepositorio.findAll();

    }

    public void save(Docente docente){
        docenteRepositorio.save(docente);
    }

    public Docente get(Long id_d){
        return docenteRepositorio.findById(id_d).get();
    }

    public void delete(Long id_d){
        docenteRepositorio.deleteById(id_d);
    }
}
