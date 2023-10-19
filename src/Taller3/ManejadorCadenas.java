package Taller3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ManejadorCadenas {

    public static String[] separar(String cadena, String separador)
    {
        String[] datos = cadena.split(separador);
        return datos;
    }

    public static Date stringFecha(String fecha, String formatoOrg){
        SimpleDateFormat formato = new SimpleDateFormat(formatoOrg);

        try{
            return formato.parse(fecha);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
