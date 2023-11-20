import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Francisco", "31", "Jugar al fútbol"));
        personas.add(new Persona("Laura", "16", "Bailar"));
        personas.add(new Persona("Gonzalo", "18", "programar"));
        personas.add(new Persona("Florencia", "29", "programar"));
        personas.add(new Persona("Franco", "18", "Cocinar"));
        personas.add(new Persona("Micaela", "22", "Cantar"));
        personas.add(new Persona("Luciano", "25", "Tocar la guitarra"));

        System.out.println("Este es el listado de las personas meyores de 18 años que les gusta programar: ");
            PersonaManager.filtrarPersonas(personas);
        System.out.println("Estos son solo los nombres de las personas: ");
            PersonaManager.allNames(personas);
        System.out.println("Estas son las 5 primeras personas de la lista: ");
            PersonaManager.limit(personas);
        System.out.println("Listado completo de personas: ");
        PersonaManager.allPeople(personas);
    }
}