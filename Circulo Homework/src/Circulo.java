public class Circulo {

    int radio;
    public static final double PI = 3.14;

    public Circulo(int radio) {
        this.radio = radio;
    }

    public void calcularArea(){
        double resultado = Math.pow(radio, 2) * PI;
        System.out.println("El área del círculo es: " + resultado);
    }
    public void calcularCircunferencia(){
        double resultado2 = (2 * PI) * radio;
        System.out.println("La circunferencia del círculo es: " + resultado2);

    }
}
