import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String respuesta = "no";

        do {
            TaskManager.addTask();
            System.out.println("Desea agregar otra tarea ? (Responder si/no): ");
            respuesta = scanner.nextLine();
        }while(Objects.equals(respuesta, "si"));

        TaskManager.markTaskAsCompleted();

        System.out.println("Desea eliminar una tarea? (Responder si/no): ");
        respuesta = scanner.nextLine();
        if(Objects.equals(respuesta, "si")){
          TaskManager.removeTask();
        }


       // TaskManager.printTaskList();



    };
    };