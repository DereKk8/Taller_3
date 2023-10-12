package Taller3;
import java.util.*;

public class Test {
    static int opcion = -1;
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        while(opcion != 0)
        {
            menu();

            switch(opcion)
            {
                case 1:
                {
                    System.out.println("Ingrese el nombre del archivo: ");
                    String nom = ent.nextLine();

                    ManejadorArchivos.leerArchivo(nom + ".txt");

                    break;
                }
                case 2:
                {


                    break;
                }
                case 3:
                {


                    break;
                }
                case 4:
                {


                    break;
                }
                case 5:
                {

                    break;
                }
                case 6:
                {


                    break;
                }
                case 7:
                {


                    break;
                }
                case 8:
                {


                    break;
                }
                case 9:
                {


                    break;
                }
                case 10:
                {


                    break;
                }
                case 11:
                {


                    break;
                }
                case 12:
                {


                    break;
                }
                case 13:
                {


                    break;
                }

            }
        }
    }

    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("/////////////////////////////");
        System.out.println("/////////////////////////////");
        System.out.println("1. Ingresar Libros y Autores");
        System.out.println("2. Registrar pedidos de libros");
        System.out.println("3. Vender un Libro");
        System.out.println("4. Consultar existencia de un Libro");
        System.out.println("5. Consultar Autores de un Libro");
        System.out.println("6. Consultar libros por nacionalidad del autor");
        System.out.println("7. Mostrar todos los libros");
        System.out.println("8. Consultar los libros de un autor");
        System.out.println("9. Consultar informacion de un libro");
        System.out.println("10. Consultar libros por antiguedad");
        System.out.println("11. Consultar libros antiguos");
        System.out.println("12. Consultar jovenes escritores");
        System.out.println("13. Serializar la libreria");
        System.out.println("0. SALIR");
        System.out.println("/////////////////////////////");
        System.out.println("/////////////////////////////");
        opcion = entrada.nextInt();
    }
}