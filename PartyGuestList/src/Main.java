
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Crear la lista de invitados
       Set<Invitado> listaDeInvitados = PartyGuestList.createInitialGuestList();

        // Mostrar lista de invitados
       PartyGuestList.showGuestList(listaDeInvitados);

        // Agregar un nuevo invitado
       PartyGuestList.addGuest(listaDeInvitados);

        //Eliminar un invitado de la lista
        PartyGuestList.removeGuest(listaDeInvitados);

        PartyGuestList.showGuestList(listaDeInvitados);

        //Buscar invitado por nombre en la lista
        PartyGuestList.isGuestInList(listaDeInvitados);

        //Total de invitados
        PartyGuestList.getTotalGuests(listaDeInvitados);
    }
}