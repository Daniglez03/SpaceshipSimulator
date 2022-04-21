import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SpaceShip unaNave = new SpaceShip("Bitship", "1234VL",
                0, 100, 0, 0, 0,
                1, 0);
        Scanner sc = new Scanner(System.in);
        boolean entradaUsuario = false;
        while (!entradaUsuario) {
            System.out.println("1.......Crear una nave");
            System.out.println("2.......Acelerar nave");
            System.out.println("3.......Frenar la nave");
            System.out.println("4.......Parar la nave");
            System.out.println("Q.......Salir");

            System.out.println("Qué deseas hacer?");
            String opcion = sc.nextLine();
            switch (opcion) {
                case"1":
                    System.out.println("Introduce el nombre de tu nave: ");
                    SpaceShip.nombre = sc.nextLine();
                    System.out.println("Introduce la matrícula galáctica: ");
                    SpaceShip.matrículaGaláctica = sc.nextLine();
                    System.out.println("Introduce la aceleración de tu nave: ");
                    SpaceShip.aceleración = sc.nextFloat();
                    sc.nextLine();
                    System.out.println(unaNave);
                    System.out.println("**********************************************************");
                    System.out.println("Nombre :" + SpaceShip.getNombre());
                    System.out.println("Matrícula Galáctica :" + SpaceShip.getMatrículaGaláctica());
                    System.out.println("Aceleración :" + SpaceShip.getAceleración() + " m/s²");
                    System.out.println("**********************************************************");
                    break;
                case"2":
                    SpaceShip.SpeedUp();
                    break;
                case"3":
                    SpaceShip.brake();
                    break;
                case"4":
                    SpaceShip.emergencyStop();
                    break;
                case"Q":
                    System.out.println("Saliendo...");
                    entradaUsuario = true;
                    break;
                default:
                    System.out.println("Introduce una opción correcta...");
            }
        }
    }
}
