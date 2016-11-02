package sv.edu.ugb.ugbvoice.dto;

import java.io.Serializable;

/**
 * Created by neto on 10-29-16.
 */

public class Equipo implements Serializable {
    private Integer idEquipo;
    private String nombre;

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
