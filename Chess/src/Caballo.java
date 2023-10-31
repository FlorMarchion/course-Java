public class Caballo extends Pieza{

    public Caballo() {
    }

    public Caballo(String nombre, String color, int valor) {
        super(nombre, color, valor);
    }

    @Override
    public String movimiento() {
        return "Me muevo en forma de L. Dos casillas y una perpendicular. También puedo saltear las piezas que esten dentro de este recorrido";
    }

    @Override
    public String ataque() {
        return "Puedo atacar solo a las piezas que esten al final de mi recorrido en forma de L. Es decir, dos casillas y una perpendicular.";
    }
}
