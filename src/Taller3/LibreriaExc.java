package Taller3;

public class LibreriaExc extends Exception{
    String detalle;

    public LibreriaExc(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "LibreriaExc{" +
                "detalle='" + detalle + '\'' +
                '}';
    }
}
