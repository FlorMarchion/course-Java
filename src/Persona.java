public class Persona {
    private String sexo;
    private String nombre;
    private int edad;
    private float altura;
    private int peso;

    Persona(){

    }
    Persona(String sexo, String nombre, int edad, float altura, int peso){
        this.sexo = sexo;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    void caminar(){
        System.out.println("Me estoy moviendo");
    }
    String escribir(){
        return "texto";
    }

    public String getSexo(){
        return this.sexo;
    }

    void setSexo(String sexo){
    this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}


