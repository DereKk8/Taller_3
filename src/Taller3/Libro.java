package Taller3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;

public class Libro {
    private int codigo;
    private static int consecutivo;
    private String titulo;
    private List<Autor> autores;
    private String editorial;
    private Date fechaPublicacion;
    private int existenciaMin;
    private int existenciaAct;
    private long precio;

    public Libro(String titulo, String editorial, Date fechaPublicacion, int existenciaMin, long precio) {
        codigo = consecutivo;
        this.titulo = titulo;
        this.autores = new ArrayList<>();
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.existenciaMin = existenciaMin;
        this.existenciaAct = existenciaMin;
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

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
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

    @Override
    public String toString() {
        String authorsStr = autores.isEmpty() ? "Sin autores" : formatAuthors();

        return String.format("Libro {%n" +
                        "  Codigo: %d,%n" +
                        "  Titulo: '%s',%n" +
                        "  Autores: %s,%n" +
                        "  Editorial: '%s',%n" +
                        "  Fecha de Publicacion: %s,%n" +
                        "  Existencias[MIN/ACT]: [%d/%d]" +
                        "  Precio: %d%n}",
                codigo, titulo, authorsStr, editorial, fechaPublicacion, existenciaMin, existenciaAct, precio);
    }

    private String formatAuthors() {
        StringJoiner joiner = new StringJoiner(",\n    ");
        for (Autor autor : autores) {
            joiner.add(autor.toString());
        }
        return "[" + joiner.toString() + "]";
    }



}
