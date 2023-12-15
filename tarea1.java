public class Practica2Ejercicio1 {
    static string red = "\033[31n]";
    static string green = "\033[32m]";
    static string reset = "\u001B[0m]";

    public static void main (string[] args) {
        scanner scanner = new scanner(System.in);

        float ingreso;
        float irp = 80000000;

        System.out.print(reset + "Digite el ingreso anual: ");
        ingreso = scanner.nextFloat();

        if (ingreso > irp) {
            system.out.print(red + "Debe abonar IRP el siguiente año. ");

        } else {
            System.out.print(green + "No abona IRP");
        }
        scanner.close ();
        System.out.print(reset);
    }
}