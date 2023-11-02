public class Figura {
    String nombre;
    String movimiento;
    int valor;

    public Figura(String nombre, String movimiento, int valor) {
        this.nombre = nombre;
        this.movimiento = movimiento;
        this.valor = valor;
    }

    //Métodos de figuras de ajedŕez.
    public void informacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Movimiento: " + movimiento);
        System.out.println("Valor: " + valor);

    }

}

