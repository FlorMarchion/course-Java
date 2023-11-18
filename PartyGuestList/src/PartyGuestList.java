import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PartyGuestList {

    public static Set<Invitado> createInitialGuestList() {
        Set<Invitado> listaDeInvitados = new HashSet<Invitado>();
        listaDeInvitados.add(new Invitado("Nicolás", "Sanchez", 20));
        listaDeInvitados.add(new Invitado("Santiago", "González", 25));
        listaDeInvitados.add(new Invitado("Sofia", "Altamirano", 31));
        listaDeInvitados.add(new Invitado("Andrés", "Gutierres", 18));
        listaDeInvitados.add(new Invitado("Ignasio", "Ponce", 22));
        listaDeInvitados.add(new Invitado("Camila", "Álvarez", 27));
        listaDeInvitados.add(new Invitado("Laura", "Martinez", 34));

        return listaDeInvitados;
    }

    public static void showGuestList(Set<Invitado> listaDeInvitados) {
        System.out.println("Lista de invitados:");
        for (Invitado invitado : listaDeInvitados) {
            System.out.println("NOMBRE: " + invitado.getNombre() + " APELLIDO: " + invitado.getAplellido() + " EDAD: " + invitado.getEdad());
        }
    }
   public static void addGuest(Set<Invitado>listaDeInvitados) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nuevo invitado a la lista");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Edad: ");
        int edad = scanner.nextInt();

        //creo un nuevo invitado y lo agrego a la lista

       Invitado nuevoInvitado = new Invitado(nombre, apellido, edad);
       listaDeInvitados.add(nuevoInvitado);
       System.out.println("Se ha agregado un nuevo invitado a la lista");
    }
    }
