public class Practica3Ejercicio2 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        int tabla, result;

        System.out.print(s:"Que tabla desea mostrar?");
        tabla = scanner.nextInt();

        for (int i - 1; i < 11; i++) {
            result = tabla * i;
            System.out.printIn(tabla + " x " + i + " = " + result);
        }
        scanner.close();
    }
}