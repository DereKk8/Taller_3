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

    public void venderLibro(String titulo, int cant) throws LibreriaExc {

            boolean encontrado = false;
            boolean disponible = false;

            for (Libro l : libros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    encontrado = true;
                    if (l.getExistenciaAct() >= cant) {
                        l.setExistenciaAct(l.getExistenciaAct() - cant);
                        disponible = true;
                    }
                }
            }

            if (!encontrado) {
                throw new LibreriaExc("" + titulo + " No encontrado");
            }
            else if (!disponible) {
                throw new LibreriaExc("Cantidad de " + titulo + " No disponible");
            }

    }


    public int[] verificarExistencia(String titulo) throws LibreriaExc {
        boolean encontrado = false;

        int[] existencias = new int[2];
        for(Libro l: libros)
        {
            if(l.getTitulo().equalsIgnoreCase(titulo))
            {
                encontrado = true;
                existencias[0] = l.getExistenciaMin();
                existencias[1] = l.getExistenciaAct();

            }
        }
        if(!encontrado)
        {
            throw new LibreriaExc(titulo + " No encontrado");
        }

        return existencias;
    }

    public void buscarAutores(String titulo) throws LibreriaExc
    {
        boolean encontrado = false;
        for(Libro l: libros)
        {
            if(l.getTitulo().equalsIgnoreCase(titulo))
            {
                encontrado = true;

                for(Autor au: l.getAutores())
                {
                    System.out.print(au.getNombre());
                }

            }
        }
        if(!encontrado)
        {
            throw new LibreriaExc(titulo + " No encontrado");
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
