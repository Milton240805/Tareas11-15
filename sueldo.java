import java.util.Scanner;

public class Sueldo {
    private Scanner scanner;
    private int[] sueldo;

    public Sueldo() {
        scanner = new Scanner(System.in);
        sueldos = new int [S];
    }

    private void capturar() {
        for (int 1 - 0; i < 5; i++) {
            System.out.print("Ingrese sueldo " + (i + 1) + ": ");
            sueldos[i] = scanner.nextInt();
        }
    }

    private void imprimir() {
        for (int i = 0; i < 5; i++) {
            System.out.printIn("Sueldo ingresado en la posicion " + (i + 1) + ": " + sueldos(i));
        }
    }

    public static void main (String[] args) {
        Sueldo sueldo = new Sueldo();
        sueldo.capturar();
        sueldo.imprimir();
    }
}