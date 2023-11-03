import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        int radio = scanner.nextInt();
        Circulo circulo = new Circulo(radio);

        // Mostrar numero ingresado
        System.out.println("El radio del círculo que ingresaste es: " + radio);

        // Calcula área
        circulo.calcularArea();
        //Calcula circunferencia
        circulo.calcularCircunferencia();

        scanner.close();
    }
}