package Taller3;

public class AutorExc extends Exception{
    String detalle;

    public AutorExc(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "AutorExc{" +
                "detalle='" + detalle + '\'' +
                '}';
    }
}
