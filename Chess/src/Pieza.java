public abstract class Pieza{
    public String nombre;
    public String Color;
    public int valor;

    protected Pieza() {
    }

    protected Pieza(String nombre, String color, int valor) {
        this.nombre = nombre;
        Color = color;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public abstract String movimiento();
    public abstract String ataque();
}
