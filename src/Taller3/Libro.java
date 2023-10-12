package Taller3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Libro {
    private int codigo;
    private int consecutivo;
    private String titulo;
    private List<Autor> autores;
    private String editorial;
    private String fechaPublicacion;
    private int existenciaMin;
    private int existenciaAct;
    private long precio;

    public Libro(String titulo, String editorial, LocalDateTime fechaPublicacion, int existenciaMin, int existenciaAct, long precio) {
        codigo = consecutivo;
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.existenciaMin = existenciaMin;
        this.existenciaAct = existenciaAct;
        this.precio = precio;
        consecutivo ++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getExistenciaMin() {
        return existenciaMin;
    }

    public void setExistenciaMin(int existenciaMin) {
        this.existenciaMin = existenciaMin;
    }

    public int getExistenciaAct() {
        return existenciaAct;
    }

    public void setExistenciaAct(int existenciaAct) {
        this.existenciaAct = existenciaAct;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }
}
