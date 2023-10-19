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

    public void venderLibro(String titulo, int cant) throws LibreriaExc{

            boolean encontrado = false;
            boolean disponible = false;

            for (Libro l : libros) {
                if (l.getTitulo().equalsIgnoreCase(titulo) && l.getExistenciaAct() > cant) {
                    encontrado = true;
                    if (l.getExistenciaAct() > cant) {
                        l.setExistenciaAct(l.getExistenciaAct() - cant);
                        disponible = true;
                    }
                }
            }

            if (!encontrado) {
                throw new LibreriaExc("Libro {" + titulo + "} no encontrado");
            }
            if (!disponible) {
                throw new LibreriaExc("no hay suficientes exitencias del libro {" + titulo + "}");
            }

    }


    public void mostrarLibros() throws LibreriaExc
    {
        if(libros.isEmpty())
        {
            throw new LibreriaExc("No hay libros en la base de Datos");
        }
        else
        {
            for(Libro l : libros)
            {
                System.out.println("" + l);
            }
        }

    }
}
