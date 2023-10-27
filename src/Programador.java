public class Programador extends Persona{
    private boolean tieneLaptop;

    /*Construnctor inicializado*/
public Programador(){

    }

    public Programador(String sexo, String nombre, int edad, float altura, int peso, boolean tieneLaptop) {
        super(sexo, nombre, edad, altura, peso);
        this.tieneLaptop = tieneLaptop;
    }

    public boolean isTieneLaptop() {
        return tieneLaptop;
    }

    public void setTieneLaptop(boolean tieneLaptop) {
        this.tieneLaptop = tieneLaptop;
    }
}
