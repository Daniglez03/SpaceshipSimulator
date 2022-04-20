public class SpaceShip {
    private static String nombre;
    private static String matrículaGaláctica;
    private static float aceleración;
    private static float velocidadX;
    private static float velocidadY;
    private static float coordenadaX;
    private static float coordenadaY;
    private static float direcciónX;
    private static float direcciónY;

    public SpaceShip(String nombre, String matrículaGaláctica, float
            aceleración, float velocidadX, float velocidadY, float
                             coordenadaX, float coordenadaY, float direcciónX, float direcciónY) {
        this.nombre = nombre;
        this.matrículaGaláctica = matrículaGaláctica;
        this.aceleración = aceleración;
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.direcciónX = direcciónX;
        this.direcciónY = direcciónY;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        SpaceShip.nombre = nombre;
    }

    public static String getMatrículaGaláctica() {
        return matrículaGaláctica;
    }

    public static void setMatrículaGaláctica(String matrículaGaláctica) {
        SpaceShip.matrículaGaláctica = matrículaGaláctica;
    }

    public static float getAceleración() {
        return aceleración;
    }

    public static void setAceleración(float aceleración) {
        SpaceShip.aceleración = aceleración;
    }

    public static float getVelocidadX() {
        return velocidadX;
    }

    public static void setVelocidadX(float velocidadX) {
        SpaceShip.velocidadX = velocidadX;
    }

    public static float getVelocidadY() {
        return velocidadY;
    }

    public static void setVelocidadY(float velocidadY) {
        SpaceShip.velocidadY = velocidadY;
    }

    public static float getCoordenadaX() {
        return coordenadaX;
    }

    public static void setCoordenadaX(float coordenadaX) {
        SpaceShip.coordenadaX = coordenadaX;
    }

    public static float getCoordenadaY() {
        return coordenadaY;
    }

    public static void setCoordenadaY(float coordenadaY) {
        SpaceShip.coordenadaY = coordenadaY;
    }

    public static float getDirecciónX() {
        return direcciónX;
    }

    public static void setDirecciónX(float direcciónX) {
        SpaceShip.direcciónX = direcciónX;
    }

    public static float getDirecciónY() {
        return direcciónY;
    }

    public static void setDirecciónY(float direcciónY) {
        SpaceShip.direcciónY = direcciónY;
    }

    public static void SpeedUp() {
        setVelocidadX(velocidadX + aceleración);
        setCoordenadaX(coordenadaX + velocidadX);
        System.out.println("Velocidad eje X" + getVelocidadX() + "Posición en X" + getCoordenadaX());
    }
    public static void brake() {
        setVelocidadX(velocidadX - aceleración);
        setCoordenadaX(coordenadaX + velocidadX);
        System.out.println("La posición en X es: " + getCoordenadaX());
    }
    @Override
    public String toString() {

        return "/             /  \\\n" +
                "           /      \\\n" +
                "         /          \\\n" +
                "--------|     /\\     |\n" +
                "        |    /  \\    |\n" +
                "        |   /    \\   |\n" +
                "        |  | (  ) |  |\n" +
                "        |  | (  ) |  |\n" +
                "   /\\   |  |      |  |   /\\\n" +
                "  /  \\  |  |      |  |  /  \\\n" +
                " |----| |  |      |  | |----|\n" +
                "-|    | | /|   .  |\\ | |    |\n" +
                " |    | /  |   .  |  \\ |    |\n" +
                " |    /    |   .  |    \\    |\n" +
                " |  /      |   .  |      \\  |\n" +
                "-|/        |   .  |        \\|\n" +
                "/   NASA   |   .  |  NASA    \\\n" +
                "(          |      |           )\n" +
                "   |    | |--|      |--| |    |\n" +
                "-/  \\-----/  \\/  \\-----/  \\--------\n" +
                " \\\\//     \\\\//\\\\//     \\\\//\n" +
                "  \\/       \\/  \\/       \\/";
    }
}


