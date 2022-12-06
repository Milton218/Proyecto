package Proyecto.Controlador;


import Proyecto.model.*;
import Proyecto.servicio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Controlador {
   @Autowired
    private AsistenciaServicio asistenciaServicio;

   @RequestMapping("/Asistencia")
    public String verPaginaDeAsistencia(Model modela, @Param("palabraClave") String palabraClave){
        List<Asistencia> listaAsistencia = asistenciaServicio.listAll(palabraClave);

        modela.addAttribute("listaAsistencia",listaAsistencia);
        modela.addAttribute("palabraClave",palabraClave);

        return "asistencia";
    }


    @RequestMapping("/nuevoa")
    public String mostrarFormularioDeRegistrarAsistencia(Model modeloa){
        Asistencia asistencia = new Asistencia();
        modeloa.addAttribute("asistencia",asistencia);
        return "nuevoa";
    }

    @RequestMapping(value = "/guardar",method = RequestMethod.POST)
    public String guardarAsistencia(@ModelAttribute("asistencia") Asistencia asistencia){
        asistenciaServicio.save(asistencia);
        return "redirect:/Asistencia";
    }

    @RequestMapping("/editar/{id_a}")
    public ModelAndView mostrarFormularioEditarAsistencia(@PathVariable(name = "id_a") Long id_a){
        ModelAndView modeloa = new ModelAndView("Edit");

        Asistencia asistencia = (Asistencia) asistenciaServicio.get(id_a);
        modeloa.addObject("asistencia",asistencia);
        return modeloa;
    }

    @RequestMapping("/eliminar/{id_a}")
    public String eliminarAsistencia(@PathVariable(name = "id_a") Long id_a){
        asistenciaServicio.delete(id_a);
        return "redirect:/Asistencia";
    }
    @Autowired
    private DocenteServicio docenteServicio;

    @RequestMapping("/Docente")
    public String verPaginaDeDocente(Model modeld, @Param("palabraClave") String palabraClave){

        List<Docente> listaDocente = docenteServicio.listAll(palabraClave);

        modeld.addAttribute("listaDocente",listaDocente);
        modeld.addAttribute("palabraClave",palabraClave);

        return "Docente";
    }

    @RequestMapping("/nuevod")
    public String mostrarFormularioDeRegistrarDocente(Model modelod){
        Docente docente = new Docente();
        modelod.addAttribute("docente",docente);
        return "nuevod";
    }

    @RequestMapping(value = "/guardard",method = RequestMethod.POST)
    public String guardarDocente(@ModelAttribute("docente") Docente docente){
        docenteServicio.save(docente);
        return "redirect:/Docente";
    }

    @RequestMapping("/editard/{id}")
    public ModelAndView mostrarFormularioEditarDocente(@PathVariable(name = "id_d") Long id_d){
        ModelAndView modelod = new ModelAndView("editar_docente");

        Docente docente = docenteServicio.get(id_d);
        modelod.addObject("docente",docente);
        return modelod;
    }

    @RequestMapping("/eliminard/{id_d}")
    public String eliminarDocente(@PathVariable(name = "id_d") Long id_d){
        docenteServicio.delete(id_d);
        return "redirect:/Docente";
    }
    @Autowired
    private EstudianteServicio estudianteServicio;

    @RequestMapping("/Estudiante")
    public String verPaginaDeEstudiante(Model modele, @Param("palabraClave") String palabraClave){

        List<Estudiante> listaProductos = estudianteServicio.listAll(palabraClave);

        modele.addAttribute("listaEstudiante",listaProductos);
        modele.addAttribute("palabraClave",palabraClave);

        return "Estudiante";
    }

    @RequestMapping("/nuevoe")
    public String mostrarFormularioDeRegistrarEstudiante(Model modeloe){
        Estudiante estudiante = new Estudiante();
        modeloe.addAttribute("estudiante",estudiante);
        return "Estudiante";
    }

    @RequestMapping(value = "/guardare",method = RequestMethod.POST)
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        estudianteServicio.save(estudiante);
        return "redirect:/Estudiante";
    }
    @RequestMapping("/editare/{id}")
    public ModelAndView mostrarFormularioEditarEstudiante(@PathVariable(name = "id_e") Long id_e){
        ModelAndView modeloe = new ModelAndView("editar_producto");

        Estudiante estudiante = estudianteServicio.get(id_e);
        modeloe.addObject("estudiante",estudiante);
        return modeloe;
    }


    @RequestMapping("/eliminare/{id_e}")
    public String eliminarEstudiante(@PathVariable(name = "id_e") Long id_e){
        estudianteServicio.delete(id_e);
        return "redirect:/Estudiante";
    }
    @Autowired
    private HorarioServicio horarioServicio;

    @RequestMapping("/Horario")
    public String verPaginaDeHorario(Model modelh, @Param("palabraClave") String palabraClave){

        List<Horario> listaHorario = horarioServicio.listAll(palabraClave);

        modelh.addAttribute("listaHorario",listaHorario);
        modelh.addAttribute("palabraClave",palabraClave);

        return "Horario";
    }

    @RequestMapping("/nuevoh")
    public String mostrarFormularioDeRegistrarHorario(Model modeloh){
        Horario horario = new Horario();
        modeloh.addAttribute("horario",horario);
        return "nuevoh";
    }

    @RequestMapping(value = "/guardarh",method = RequestMethod.POST)
    public String guardarPHorario(@ModelAttribute("producto") Horario horario){
        horarioServicio.save(horario);
        return "redirect:/Horario";
    }

    @RequestMapping("/editarh/{id_h}")
    public ModelAndView mostrarFormularioEditarHorario(@PathVariable(name = "id_h") Long id_h){
        ModelAndView modeloh = new ModelAndView("editar_horario");

        Horario horario = horarioServicio.get(id_h);
        modeloh.addObject("horario",horario);
        return modeloh;
    }

    @RequestMapping("/eliminarh/{id_h}")
    public String eliminarHorario(@PathVariable(name = "id_h") Long id_h){
        horarioServicio.delete(id_h);
        return "redirect:/Horario";
    }

    @Autowired
    private SupervisorServicio supervisorServicio;

    @RequestMapping("/Supervisor")
    public String verPaginaDeSupervisor(Model models, @Param("palabraClave") String palabraClave){

        List<Supervisor> listaSupervisor = supervisorServicio.listAll(palabraClave);

        models.addAttribute("listaSupervisor",listaSupervisor);
        models.addAttribute("palabraClave",palabraClave);

        return "Supervisor";
    }

    @RequestMapping("/nuevos")
    public String mostrarFormularioDeRegistrarSupervisor(Model modelos){
        Supervisor supervisor = new Supervisor();
        modelos.addAttribute("supervisor",supervisor);
        return "nuevos";
    }

    @RequestMapping(value = "/guardars",method = RequestMethod.POST)
    public String guardarSupervisor(@ModelAttribute("supervisor") Supervisor supervisor){
        supervisorServicio.save(supervisor);
        return "redirect:/Supervisor";
    }
    @RequestMapping("/Editars/{id_s}")
    public ModelAndView mostrarFormularioEditarSupervisor(@PathVariable(name = "id_s") Long id_s){
        ModelAndView modelos = new ModelAndView("Editars");

        Supervisor supervisor = supervisorServicio.get(id_s);
        modelos.addObject("supervisor",supervisor);
        return modelos;
    }


    @RequestMapping("/Eliminars/{id_s}")
    public String eliminarSupervisor(@PathVariable(name = "id_s") Long id_s){
        supervisorServicio.delete(id_s);
        return "redirect:/Supervisor";
    }
}
