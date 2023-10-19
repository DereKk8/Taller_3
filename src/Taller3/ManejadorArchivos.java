package Taller3;

import java.io.*;
import java.util.Date;

public class ManejadorArchivos {

    public static Libreria leerArchivoLibros(String nombreArch)
    {
        Libreria libreria = new Libreria();

        try{
            InputStreamReader lec = new InputStreamReader(new FileInputStream(nombreArch));
            BufferedReader datos = new BufferedReader(lec);
            String linea = datos.readLine();

            while(!linea.equals("#FIN")){
                linea = datos.readLine();
                linea = datos.readLine();
                String[] dato = ManejadorCadenas.separar(linea, "\\*");

                Date fecha = ManejadorCadenas.stringFecha(dato[2], "yyyy-MM-dd");
                int exMin = Integer.parseInt(dato[3].trim());
                long precio = Long.parseLong(dato[4]);

                  //FUTURA ECEPCION MANEJADORCADENAS if(!= NULL)
                Libro libro = new Libro(dato[0].trim(), dato[1],fecha, exMin, precio);
                libreria.getLibros().add(libro);


                linea = datos.readLine();
                linea = datos.readLine();
                linea = datos.readLine();

                while(!linea.trim().equals("0")){


                    String[] datosAutor = ManejadorCadenas.separar(linea, "\\*");

                    Date fechaNacimiento = ManejadorCadenas.stringFecha(datosAutor[2], "dd-MM-yyyy");
                    Autor autor = new Autor(datosAutor[0], datosAutor[1], fechaNacimiento);
                    libro.getAutores().add(autor);

                    linea = datos.readLine();
                }
                linea = datos.readLine();


            }

        }catch (IOException e)
        {
            e.printStackTrace();
        }


        return libreria;
    }

    public static void leerArchivoPedidos(String nomArch, Libreria lib)
    {
        try{
            InputStreamReader lec = new InputStreamReader(new FileInputStream(nomArch));
            BufferedReader datos = new BufferedReader(lec);
            String linea = datos.readLine();
            linea = datos.readLine();
            linea = datos.readLine();

            while(linea != null)
            {

                String[] datosPedido = ManejadorCadenas.separar(linea, "\\*");
                linea = datos.readLine();


                int canSolicitada = Integer.parseInt(datosPedido[1]);

                for(Libro l:lib.getLibros()){
                    if(l.getTitulo().equalsIgnoreCase(datosPedido[0].trim())){
                        int nuevaExistenciaMin = l.getExistenciaMin() + canSolicitada;
                        int nuevaExistenciaAct = l.getExistenciaAct() + canSolicitada;

                        l.setExistenciaMin(nuevaExistenciaMin);
                        l.setExistenciaAct(nuevaExistenciaAct);
                    }
                }

            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static Libreria cargarDeArchivo(String nomArch)
    {
        Libreria lib = null;
        try{
            FileInputStream fileIn = new FileInputStream(nomArch);
            ObjectInputStream in =  new ObjectInputStream(fileIn);
            lib = (Libreria) in.readObject();
        }
        catch (IOException e)
        {
            System.out.println("El archivo no existe:" + e);
        }
        catch (Exception e)
        {
            System.out.println("Ocurrio un error:" + e);
        }
        return lib;
    }

    public static void salvarAArchivo(String nomArch, Libreria lib)
    {
        try{
            FileOutputStream fileOut = new FileOutputStream(nomArch);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(lib);
            out.close();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
