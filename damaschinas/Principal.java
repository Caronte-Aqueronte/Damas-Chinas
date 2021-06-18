package damaschinas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Principal damas = new Principal();
    }

    public Principal() {
        menuPrincipal();
    }
    Scanner scanner = new Scanner(System.in);
    Tablero tablero = new Tablero();

    public void menuPrincipal() {
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("***\tBIENVENIDO\t***");
            System.out.println("1) Generar Tablero\n2) Ingresar Nuevo Jugador\n3) Reportes de partidas ganadas y perdias\n4) Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    tablero.imprimirTablero();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
