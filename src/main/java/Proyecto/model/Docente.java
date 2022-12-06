package Proyecto.model;

import Proyecto.servicio.DocenteServicio;

import javax.persistence.*;

@Entity
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_d;

    @Column(nullable = false,length = 60)
    private String NombreDocente;
    @Column(nullable = false,length = 60)
    private int Telefono;
    @Column(nullable = false,length = 60)
    private String Correo;
    @Column(nullable = false,length = 60)
    private int RU;

    public Docente(Long id_d, String nombreDocente, int telefono, String correo, int RU) {
        this.id_d = id_d;
        NombreDocente = nombreDocente;
        Telefono = telefono;
        Correo = correo;
        this.RU = RU;
    }

    public Docente() {

    }

    public String getNombreDocente() {
        return NombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        NombreDocente = nombreDocente;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getRU() {
        return RU;
    }

    public void setRU(int RU) {
        this.RU = RU;
    }

    public Long getId_d() {
        return id_d;
    }

    public void setId_d(Long id_d) {
        this.id_d = id_d;
    }
}
