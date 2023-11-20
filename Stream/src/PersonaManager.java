import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonaManager {

    //inicializo un listado de personas


    public static void filtrarPersonas(List<Persona> personas){
        List<Persona> personas18 =
                personas.stream()
                .filter(persona -> persona.getEdad().equals("18") && persona.getHobby().equals("programar"))
                .toList();

        personas18.forEach(System.out::println);
    }


    public static void allNames(List<Persona> personas){
        List<NewPersonList> personName =
                personas.stream()
                        .map(NewPersonList::map)
                        .toList();
                personName.forEach(System.out::println);

    }

    public static void limit(List<Persona> persona){
        List<Persona> five =
                persona.stream()
                        .limit(5)
                        .toList();
        five.forEach(System.out::println);
    }

    public static void allPeople(List<Persona> persona){
        List<Persona> completedList =
                persona.stream()
                        .toList();
        completedList.forEach(System.out::println);
    }
}
