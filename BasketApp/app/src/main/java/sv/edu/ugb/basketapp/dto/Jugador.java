package sv.edu.ugb.basketapp.dto;

import java.io.Serializable;

/**
 * Created by neto on 11-03-16.
 */

public class Jugador implements Serializable{
    private Integer idJugador;
    private String nombre;
    private String apellido;
    private String sexo;
    private Integer idEquipo;

    public Jugador(String nombre, String apellido, String sexo, Integer idEquipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.idEquipo = idEquipo;
    }

    public Jugador(Integer idJugador, String nombre, String apellido, String sexo, Integer idEquipo) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.idEquipo = idEquipo;
    }

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }
}
