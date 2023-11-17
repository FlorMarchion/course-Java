import java.util.ArrayList;
    import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private static List<Tarea> listaDeTareas = new ArrayList<Tarea>();
    public static void addTask() {
    //Agrego la tarea nueva desde la consola:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la descrición de la tarea: ");
        String description = scanner.nextLine();

        System.out.println("Ingrese la fecha en que debe realizar la tarea en formato dd/mm/yy: ");
        String fecha = scanner.nextLine();

        System.out.println("Puntuar del 1 al 10 la prioridad de la tarea, siendo 10 el número más alto: ");
        int prioridad = scanner.nextInt();

        //Agrego la tarea a la lista:
        listaDeTareas.add(new Tarea(description, fecha, prioridad));

        System.out.println("LA TAREA SE HA GUARDADO CORRECTAMENTE! :)");

    }

    public static void markTaskAsCompleted() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese descripción de la tarea que has completado: ");
        String word = scanner.nextLine();

        for (int i = 0; i < listaDeTareas.size(); i++) {
            Tarea tarea = listaDeTareas.get(i);

            if (tarea.getDescripcion().contains(word)) {
                System.out.println("Tarea que contiene la palabra " + word.toUpperCase() + ": " + tarea.getDescripcion());
                Tarea tareasCompletadas = listaDeTareas.get(i);
                tareasCompletadas.setCompleted(true);
                System.out.println("La tarea ha sido completada :) !");
            } else {
                System.out.println("No se econtraron tareas con: " + word.toUpperCase());

            }
            if (tarea.isCompleted()) {
                System.out.println("Catidad de tareas completadas: " + listaDeTareas.size());
            } else {
                System.out.println("Aún no ha completado ninguna tarea :(");
            }
        }
    }
    public  static void removeTask() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique el número de la tarea que desea eliminar: ");

        //lista de tareas con indice:
        for (int i = 0; i < listaDeTareas.size(); i++) {
            Tarea tarea = listaDeTareas.get(i);
            System.out.println(i + "- " + tarea.getDescripcion());

            int taskToDelete = scanner.nextInt();

            Tarea tareaRemoved = listaDeTareas.remove(taskToDelete);
            System.out.println("La siguiente tarea ha sido removida de la lista: " + tareaRemoved.getDescripcion());
        }
    }

    /*public static void printTaskList(){
        //Mostrar lista de tareas pendientes:
        for(Tarea tareas : listaDeTareas){
            System.out.println("Tarea pendiente: " + tareas.getDescripcion());
        }
        //Total de tareas a completar:
       int totalDeTareas =  listaDeTareas.size();
        System.out.println("Total de tareas a completar: " + totalDeTareas);
    }*/

    };