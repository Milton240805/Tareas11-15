import java.until.Scanner;

public class Persona {

    private Scanner scanner;
    private String nombre;
    private int edad;

    public void inicializar () {
        scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Digite edad: ");
        edad = scanner.nextInt();
    }

    public void imprimir() {
        System.out.printIn ("Nombre ingresado = " + nombre);
        System.out.printIn ("Edad digitado = " + edad);
    }

    public void buscarMayor () {
        if (edad >= 18) {
            System.out.printIn(nombre + "es mayor de edad.");
        } else {
            System.out.printIn(nombre + "es menor de edad.");
        }
    }

    public static void main (String[] args) {
        Persona persona = new Persona ();
        persona.inicializar();
        persona.imprimir();
        persona.buscaMayor;
    }
}