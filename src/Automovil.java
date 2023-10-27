public class Automovil {
    String marca;
    String modelo;
    int anioFabricacion;

    Automovil(){

    }

    Automovil(String marca, String modelo, int anioFabricacion){
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }
    void acelerar(){
        System.out.println("Acelerando");
    }
    String frenar(){
    return "Frenando";
    }
}
