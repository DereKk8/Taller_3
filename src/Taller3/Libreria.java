package Taller3;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    List<Libro> libros = new ArrayList<>();

    public Libreria(){

    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
