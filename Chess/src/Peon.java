public class Peon extends Pieza{

    public Peon(String nombre) {
        this.nombre = nombre;
    }

    public Peon(String nombre, String color, int valor) {
        super(nombre, color, valor);
    }

    @Override
    public String movimiento() {
        return "Una casilla al frente";
    }

    @Override
    public String ataque() {
        return "Una casilla en diagonal al frente";
    }
}
