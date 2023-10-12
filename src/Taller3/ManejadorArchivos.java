package Taller3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManejadorArchivos {

    public static Libreria leerArchivo(String nombreArch)
    {
        Libreria libreria = new Libreria();

        try{
            InputStreamReader lec = new InputStreamReader(new FileInputStream(nombreArch));
            BufferedReader datos = new BufferedReader(lec);
            String linea = datos.readLine();

            while(!linea.equals("#FIN")){
                System.out.println(linea);
                linea = datos.readLine();
                linea = datos.readLine();
                String[] dato = ManejadorCadenas.separar(linea, "*");

                Libro libro = new Libro(dato[0], dato);

                libreria.libros.add()
            }

        }catch (IOException e)
        {
            e.printStackTrace();
        }


        return libreria;
    }
}
