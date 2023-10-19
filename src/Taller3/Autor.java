package Taller3;

import java.time.LocalDateTime;
import java.util.Date;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private Date fechaNacimiento;

    public Autor(String nombre, String nacionalidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format("Autor: %s\n Nacionalidad: %s\n Fecha de Nacimiento: %s",
                nombre, nacionalidad, fechaNacimiento);
    }

}
