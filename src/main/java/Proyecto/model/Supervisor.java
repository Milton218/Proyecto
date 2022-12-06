package Proyecto.model;

import javax.persistence.*;

@Entity
public class Supervisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_s;

    @Column(nullable = false,length = 60)
    private String NombreS;
    @Column(nullable = false,length = 60)
    private String Telefono;
    @Column(nullable = false,length = 60)
    private String Password;

    public Supervisor(Long id_s, String nombreS, String telefono, String password) {
        this.id_s = id_s;
        NombreS = nombreS;
        Telefono = telefono;
        Password = password;
    }

    public Supervisor() {
    }

    public Long getId_s() {
        return id_s;
    }

    public void setId_s(Long id_s) {
        this.id_s = id_s;
    }

    public String getNombreS() {
        return NombreS;
    }

    public void setNombreS(String nombreS) {
        NombreS = nombreS;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
