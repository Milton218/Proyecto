package Proyecto.model;

import javax.persistence.*;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_e;


    @Column(nullable = false,length = 60)
    private String Nombre;
    @Column(nullable = false,length = 60)
    private int Ru;

    public Estudiante() {

    }

    public Long getId_e() {
        return id_e;
    }

    public void setId_e(Long id_e) {
        this.id_e = id_e;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getRu() {
        return Ru;
    }

    public void setRu(int ru) {
        Ru = ru;
    }

    public Estudiante(Long id_e, String nombre, int ru) {
        this.id_e = id_e;
        Nombre = nombre;
        Ru = ru;
    }
}
