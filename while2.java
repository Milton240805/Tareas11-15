@author MILTON AURELIO

public class Practica3EjercicioW2 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        String usuario;
        String usuarioCorrecto = "admin";
        int pin;
        int pinCorrecto = 1234567;
        int correcto = 0;

        System.out.printIn(x: "Acceso al sistema.! ");
        while (correcto <= 0) {

            System.out.print(s: "Ingrese usuario: ");
            usuario = scanner.nextLine();
            System.out.print(s: "Ingrese pin: ");
            pin = scanner.nextInt();

            if ((usuario.equals(usuarioCorrecto)) && (pin == pinCorrecto)) {
                correcto = 1;
            }
            System.out.prinIn(x: "Usuario y/o pin incorrecto.! ");
            scanner.nextLine();
        }
        System.out.printIn(x:"Bienvenido al Sistema.! ");
        scanner.close();
    }
}