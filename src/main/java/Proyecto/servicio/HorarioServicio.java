package Proyecto.servicio;

import Proyecto.model.Horario;
import Proyecto.repositorio.IHorarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioServicio {
    @Autowired
    private IHorarioRepositorio horarioRepositorio;

    public List<Horario> listAll(String palabraClave){
        if(palabraClave != null){
            return horarioRepositorio.findAll(palabraClave);
        }
        return horarioRepositorio.findAll();

    }

    public void save(Horario horario){
        horarioRepositorio.save(horario);
    }

    public Horario get(Long id_h){
        return horarioRepositorio.findById(id_h).get();
    }

    public void delete(Long id_h){
        horarioRepositorio.deleteById(id_h);
    }
}
