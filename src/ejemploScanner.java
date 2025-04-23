import java.util.Scanner;
public class ejemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el valor que pretende invertir este mes: ");
        double valor = scanner.nextDouble();

        System.out.println(nombre + " que tiene " + edad + " años, invertirá ARS " + valor + " este mes.");

        scanner.close();
    }
}