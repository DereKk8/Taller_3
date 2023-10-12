package Taller3;

public class ManejadorCadenas {

    public static String[] separar(String cadena, String separador)
    {
        String[] datos = cadena.split(separador);
        return datos;
    }
}
