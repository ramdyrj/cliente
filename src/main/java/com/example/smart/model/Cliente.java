package com.example.smart.model;

import javax.persistence.*;

@Entity
@Table(name = "test_client")
public class Cliente {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String nombre;
    @Column(name="ap_paterno")
    private String apPaterno;

    @Column(name="ap_materno")
    private String apMaterno;

    private String correo;


    public Cliente() {
    }


    public Cliente(int id, String nombre, String apPaterno, String apMaterno, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
