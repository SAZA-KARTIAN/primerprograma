import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        // Genera un número aleatorio entre 0 y 100 (inclusive)
        Random random = new Random();
        int numeroSecreto = random.nextInt(101);

        Scanner scanner = new Scanner(System.in);
        int intentosMaximos = 5;
        int intentos = 0;
        boolean acertado = false;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Estoy pensando en un número entre 0 y 100. Tienes "
                + intentosMaximos + " intentos para adivinarlo.");

        // Bucle de intentos
        while (intentos < intentosMaximos) {
            System.out.print("Intento " + (intentos + 1) + ": ingresa tu número: ");
            int intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! ¡Lo has adivinado en " + intentos + " intentos!");
                acertado = true;
                break;  // Salimos del bucle al acertar
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("Mi número es más grande.");
            } else {
                System.out.println("Mi número es más pequeño.");
            }
        }

        if (!acertado) {
            System.out.println("Se han agotado tus " + intentosMaximos + " intentos.");
            System.out.println("El número secreto era: " + numeroSecreto);
        }

        scanner.close();
    }
}

