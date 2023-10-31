import java.util.Scanner;

public class Tablero {
    String material;
    int cantCuadrados;
    double tamanio;



    Tablero(){}

    public Tablero(String material, int cantCuadrados, double tamanio) {
        this.material = material;
        this.cantCuadrados = cantCuadrados;
        this.tamanio = tamanio;
    }

    public static void comenzarJuego(){
        int numero = 3;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Comienzan las blancas. Mueve un peón ejecutando el numero 3!");
           numero = scanner.nextInt();
        }while (3 != numero);
        System.out.println("Has movido el peón.");
        scanner.close();
    }

}
