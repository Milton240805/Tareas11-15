import java.until.Scanner;

public class Practica2Ejercicio2 {

    public static void main (String○[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.print(s:"Digite primer numero:");
        num1 = scanner.nextInt();
        System.out.print(s:"Digite segundo numero:");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.print(s: "primer numero es mayor");
        } else if (num2 > num1) {
            System.out.print (s: "Segundo numero es mayor");
        } else if (num2 > num1) {
            System.out.print(s: "Son iguales!");
        }
        scanner.close();
    }
}