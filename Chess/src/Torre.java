public class Torre extends Pieza{
    public Torre() {
    }

    public Torre(String nombre, String color, int valor) {
        super(nombre, color, valor);
    }

    @Override
    public String movimiento() {
        return "Me muevo en línea recta hacia cualquier dirección";
    }

    @Override
    public String ataque() {
        return "Muedo atacar en línea recta hacia cualquier dirección";
    }
}
