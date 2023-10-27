// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
     /*   Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil( "Renault",  "Clio",  2020);

        System.out.println("Auto 1, marca: " + auto1.marca);
        System.out.println("Auto 2, marca: " + auto2.marca); */

        Persona persona1 = new Persona("Hombre", "Bender", 5, 0.60f, 15);
        Persona persona2 = new Persona ("Mujer", "Flor", 29, 1.50f, 47);

        persona1.setNombre("Gabi");
        persona2.setNombre("Flor");

        Programador programador1 = new Programador("Hombre", "Gabi", 5, 1.72f, 65, true);

        programador1.setTieneLaptop(true);

        System.out.println("persona1, Me llamo " + persona1.getNombre());
        System.out.println("persona2, Yo soy: " + persona2.getNombre() + ". Tengo " + persona2.getEdad() + " años");
        System.out.println("persona programador1- Nombre: " + programador1.getNombre() + ". Tiene laptop:" + programador1.isTieneLaptop());

    }
}