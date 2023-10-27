// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     /*   Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil( "Renault",  "Clio",  2020);

        System.out.println("Auto 1, marca: " + auto1.marca);
        System.out.println("Auto 2, marca: " + auto2.marca); */

        Persona persona = new Programador();
        Persona programador2 = new Programador ("Mujer", "Flor", 29, 1.50f, 47, true);
        Persona cocinero = new Cocinero("Hombre", "Bender", 5, 0.65f, 14, true);

        persona.setNombre("Gabi");
        programador2.setNombre("Flor");


        Programador programador1 = new Programador("Hombre", "Gabi", 5, 1.72f, 65, true);

        programador1.setTieneLaptop(true);

        System.out.println("persona1, Me llamo " + persona.getNombre());
        System.out.println("persona2, Yo soy: " + programador2.getNombre() + ". Tengo " + programador2.getEdad() + " años");
        System.out.println("persona programador1- Nombre: " + programador1.getNombre() + ". Tiene laptop:" + programador1.isTieneLaptop());
        System.out.println("persona 3 - Me llamo " + cocinero.getNombre() + " Tengo " + cocinero.getEdad() + " y " );
        cocinero.trabajar();
    }
}