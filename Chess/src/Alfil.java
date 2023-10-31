public class Alfil extends Pieza{

    public static int valor = 3;
    public Alfil() {
    }

    public Alfil(String nombre, String color, int valor) {
        super(nombre, color, valor);
    }

    public static void setValor(int valor) {
        Alfil.valor = valor;
    }

    @Override
    public String movimiento() {
     return "Puedo moverme en diagonal (hacia atrás o hacia el frente) solo dentro de las casillas del mismo color correspondinetes a mi punto de partida.";
    }

    @Override
    public String ataque() {
        return "Puedo atacar en diagonales, hacia atrás o hacia el frente.";
    }
}
