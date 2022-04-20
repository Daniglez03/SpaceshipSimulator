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
    public static void load() {
        if (capacidad >= MAX_CAPACIDAD) {
            System.out.println("La nave está llena !!!");
        }else {
            capacidad++;
        }
    }
    public static void unload() {
        if (capacidad <= 0) {
            System.out.println("No se pueden descargar más, está vacío");
        }else  {
            capacidad--;
        }
    }
}
