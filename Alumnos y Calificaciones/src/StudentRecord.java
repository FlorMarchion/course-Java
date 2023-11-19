import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentRecord {
    public static Map<String, Integer> createInitialStudentList() {
        Map<String, Integer> listadoDeAlumnos = new HashMap<>();

        //Agrego alumnos a la lista
        listadoDeAlumnos.put("Francisco", 9);
        listadoDeAlumnos.put("Sofía", 10);
        listadoDeAlumnos.put("Esteban", 8);
        listadoDeAlumnos.put("Lorena", 5);
        listadoDeAlumnos.put("Jorge", 2);
        listadoDeAlumnos.put("Mariano", 4);
        listadoDeAlumnos.put("Antonella", 10);
        listadoDeAlumnos.put("Mateo", 6);

        return listadoDeAlumnos;

    }

    public static void showList(){
      for(Map.Entry<String, Integer> entry : createInitialStudentList().entrySet()){
          String nombre = entry.getKey();
          int calificacion = entry.getValue();
          System.out.println("NOMBRE: " + nombre + " -CALIFICACIÓN: " + calificacion);
      }
    }

    public static void addStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agrega un nuevo alumno a la lista");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Agrega calificación: ");
        int calificacion = scanner.nextInt();

        // Obtener la instancia existente del mapa "listadoDeAlumnos"
        Map<String, Integer> listadoDeAlumnos = createInitialStudentList();

        // Agregar el nuevo alumno al listado existente
        listadoDeAlumnos.put(nombre, calificacion);

        System.out.println("El/La alumno/a " + nombre.toUpperCase() + " se agregó con éxito a la lista");
        System.out.println("Lista de alumnos: " + listadoDeAlumnos);

    }

    public static void removeStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para eliminar a un alumno de la lista ingrese el nombre");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        Map<String, Integer> listadoDeAlumnos = createInitialStudentList();

        boolean containStudent = listadoDeAlumnos.containsKey(nombre);
        if(containStudent){
            listadoDeAlumnos.remove(nombre);
            System.out.println("El alumno llamado " + nombre.toUpperCase() + " ha sido removido de la lista");
        }else{
            System.out.println("El alumno no existe en la lista");
        }
        System.out.println("Lista de alumnos: " + listadoDeAlumnos);
    }

    public static void getGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Acceder a la calificación del alumno por su nombre");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        Map<String, Integer> listadoDeAlumnos = createInitialStudentList();
        int findedStudent =  listadoDeAlumnos.get(nombre);

        System.out.println("La calificación de " + nombre + " es: " +  findedStudent);
    }

    public static void isStudentInRecord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Si desea saber que el alumno existe en la lista");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        Map<String, Integer> listadoDeAlumnos = createInitialStudentList();
        boolean student = listadoDeAlumnos.containsKey(nombre);

        if(student){
            System.out.println("El/la alumno/a " + nombre.toUpperCase() + " se encuentra en la lista");
        }else {
            System.out.println("El/la alumno/a " + nombre.toUpperCase() + " no se encontró en la lista");
        }
    }

    public static void searchCalificationByStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buscar calificación existe en el registro");
        System.out.println("Calificación: ");
        int calificacion = scanner.nextInt();

        Map<String, Integer> listadoDeAlumnos = createInitialStudentList();
        boolean student = listadoDeAlumnos.containsValue(calificacion);

        if(student){
            System.out.println("Existen alumnos con calificación  " + calificacion + " en la lista");
        }else {
            System.out.println("No existen estudiantes con calificación " + calificacion + " en la lista");
        }
    }
}
