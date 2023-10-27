public class Cocinero extends Persona {

    private boolean cocinaProfesional;
    public Cocinero(){
    }

    public Cocinero(String sexo, String nombre, int edad, float altura, int peso, boolean cocinaProfesional) {
        super(sexo, nombre, edad, altura, peso);
        this.cocinaProfesional = cocinaProfesional;
    }
    @Override
    public void trabajar(){
        System.out.println("Trabaja 8 horas diarias");
    }
    public boolean isCocinaProfesional() {return cocinaProfesional;}

    public void setCocinaProfesional(boolean cocinaProfesional) {
        this.cocinaProfesional = cocinaProfesional;
    }
}
