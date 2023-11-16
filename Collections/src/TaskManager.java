import java.util.ArrayList;
    import java.util.List;

    public class TaskManager {
    private static List<Tarea> listaDeTareas = new ArrayList<Tarea>();
    public static void addTask() {
        listaDeTareas.add(new Tarea("Pasear a Bender", "Hoy", 5));
        listaDeTareas.add(new Tarea("Ir al supermercado", "hoy", 9));

    }

    public static void markTaskAsCompleted(){
    //Obtengo tareas específicas por índice:
        Tarea tareasCompletadas = listaDeTareas.get(1);
        tareasCompletadas.setCompleted(true);
        System.out.println("La siguiente tarea ha sido completada: " + tareasCompletadas.getDescripcion());
    }

    public  static void removeTask(){
        Tarea tareaRemoved = listaDeTareas.remove(1);
        System.out.println("La siguiente tarea ha sido removida de la lista: " + tareaRemoved.getDescripcion());
    }

    public static void printTaskList(){
        //Mostrar lista de tareas pendientes:
        for(Tarea tareas : listaDeTareas){
            System.out.println("Lista de tareas pendientes: " + tareas.getDescripcion());
        }
        //Total de tareas a completar:
       int totalDeTareas =  listaDeTareas.size();
        System.out.println("Total de tareas a completar: " + totalDeTareas);
    }

    };