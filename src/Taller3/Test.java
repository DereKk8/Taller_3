package Taller3;
import java.util.*;

public class Test {
    static int opcion = -1;

    public static void main(String[] args) {
        Libreria lib = new Libreria();
        Scanner ent = new Scanner(System.in);
        while (opcion != 0) {
            menu();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre del archivo: ");
                    String nom = ent.nextLine();

                    lib = ManejadorArchivos.leerArchivoLibros(nom + ".txt");

                    break;
                }
                case 2: {
                    System.out.println("Ingrese el nombre del archivo: ");
                    String nom = ent.nextLine();

                    ManejadorArchivos.leerArchivoPedidos(nom + ".txt", lib);


                    break;
                }
                case 3: {
                    ent.nextLine();
                    System.out.println("Ingrese el titulo del libro: ");
                    String titulo = ent.nextLine();
                    System.out.println("Ingrese numero de unidades a comprar: ");
                    int cant = ent.nextInt();

                    try
                    {
                        lib.venderLibro(titulo.trim(), cant);
                    }
                    catch(LibreriaExc e)
                    {
                        System.out.println(e);
                    }



                    break;
                }
                case 4: {
                    ent.nextLine();
                    System.out.println("Ingrese el titulo del libro: ");
                    String titulo = ent.nextLine();

                    try
                    {
                        lib.verificarExistencia(titulo);
                    }
                    catch(LibreriaExc e)
                    {
                        System.out.println(e);
                    }


                    break;
                }
                case 5: {
                    ent.nextLine();
                    System.out.println("Ingrese el titulo del libro: ");
                    String titulo = ent.nextLine();

                    try
                    {
                        lib.buscarAutores(titulo);
                    }
                    catch(LibreriaExc e)
                    {
                        System.out.println(e);
                    }

                    break;
                }
                case 6: {
                    ent.nextLine();
                    System.out.println("Ingrese la nacionalidad: ");
                    String nacionalidad = ent.nextLine();

                    try
                    {
                        lib.consultarLibrosPorNacionalidad(nacionalidad);
                    }
                    catch(LibreriaExc e)
                    {
                        System.out.println(e);
                    }


                    break;
                }
                case 7: {
                    try{
                        lib.mostrarLibros();
                    }catch(LibreriaExc e){
                        System.out.println("" + e);
                    }

                    break;
                }
                case 8: {
                    ent.nextLine();
                    System.out.println("Ingrese el nombre del autor: ");
                    String nombre = ent.nextLine();

                    try
                    {
                        lib.consultarLibrosDeUnAutor(nombre);
                    }
                    catch(LibreriaExc e)
                    {
                        System.out.println(e);
                    }

                    break;
                }
                case 9: {
                    ent.nextLine();
                    System.out.println("Ingrese el titulo: ");
                    String titulo = ent.nextLine();

                    try
                    {
                        lib.consultarInfoLibro(titulo);
                    }
                    catch(LibreriaExc e)
                    {
                        System.out.println(e);
                    }

                    break;
                }
                case 10: {


                    break;
                }
                case 11: {


                    break;
                }
                case 12: {


                    break;
                }
                case 13: {
                    ent.nextLine();
                    System.out.println("Ingrese lo que desea realizar: 'serializar'-'deserializar'");
                    String res = ent.nextLine();
                    if(res.equalsIgnoreCase("serializar")){
                        System.out.println("Ingrese el nombre del archivo a crear");
                        res = ent.nextLine();
                        System.out.println("Se guardara la libreria en un archivo...");
                        ManejadorArchivos.salvarAArchivo(res, lib);
                    }else if(res.equalsIgnoreCase("deserializar")){
                        System.out.println("Ingrese el nombre del archivo");
                        res = ent.nextLine();
                        System.out.println("Se cargara la libreria desde un archivo...");
                        Libreria nuevoLib = ManejadorArchivos.cargarDeArchivo(res);
                    }else{
                        System.out.println("Ingrese correctamente la opcion");
                    }

                    break;
                }

            }
        }
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("           MENÚ PRINCIPAL         ");
        System.out.println("================================");
        System.out.println("1.  Ingresar Libros y Autores");
        System.out.println("2.  Registrar Pedidos de Libros");
        System.out.println("3.  Vender un Libro");
        System.out.println("4.  Consultar Existencia de un Libro");
        System.out.println("5.  Consultar Autores de un Libro");
        System.out.println("6.  Consultar Libros por Nacionalidad del Autor");
        System.out.println("7.  Mostrar Todos los Libros");
        System.out.println("8.  Consultar los Libros de un Autor");
        System.out.println("9.  Consultar Información de un Libro");
        System.out.println("10. Consultar Libros por Antigüedad");
        System.out.println("11. Consultar Libros Antiguos");
        System.out.println("12. Consultar Jóvenes Escritores");
        System.out.println("13. Serializar la Librería");
        System.out.println("0.  SALIR");
        System.out.println("================================");
        System.out.print("Seleccione una opción: ");

        opcion = entrada.nextInt();
    }
}
