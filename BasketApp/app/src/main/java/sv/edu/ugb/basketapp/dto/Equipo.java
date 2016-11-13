package sv.edu.ugb.basketapp.dto;

import java.io.Serializable;

/**
 * Created by neto on 11-03-16.
 */

public class Equipo implements Serializable {
    private Integer idEquipo;
    private String nombre;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(Integer idEquipo, String nombre) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }
}
