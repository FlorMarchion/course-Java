public class Invitado {
    String nombre;
    String aplellido;
    int edad;

    public Invitado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAplellido() {
        return aplellido;
    }

    public void setAplellido(String aplellido) {
        this.aplellido = aplellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Invitado(String nombre, String aplellido, int edad) {
        this.nombre = nombre;
        this.aplellido = aplellido;
        this.edad = edad;


    }
}
