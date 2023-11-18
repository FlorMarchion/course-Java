import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Crear la lista de invitados
        Set<Invitado> listaDeInvitados = PartyGuestList.createInitialGuestList();

        // Mostrar lista de invitados
        PartyGuestList.showGuestList(listaDeInvitados);

        // Agregar un nuevo invitado
        PartyGuestList.addGuest(listaDeInvitados);

        // Mostrar la lista actualizada
        PartyGuestList.showGuestList(listaDeInvitados);
    }
}