public class Cargo extends SpaceShip{
    public static final int MAX_CAPACIDAD = 10;
    public static int capacidad;
    public Cargo(String nombre, String matrículaGaláctica,
                 float aceleración, float velocidadX, float velocidadY,
                 float coordenadaX, float coordenadaY, float direcciónX,
                 float direcciónY) {
        super(nombre, matrículaGaláctica, aceleración, velocidadX, velocidadY,
                coordenadaX, coordenadaY, direcciónX, direcciónY);
    }
    public static int getCapacidad() {
        return capacidad;
    }
    public static void setCapacidad(int capacidad) {
        Cargo.capacidad = capacidad;
    }
}
