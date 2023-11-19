import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        //Crear lista de alumnos
        StudentRecord.createInitialStudentList();

        //Mostrar la lista
        StudentRecord.showList();

        //Agregar alumno/a desde la consola
        StudentRecord.addStudent();


        //Eliminar un alumno de la lista
        StudentRecord.removeStudent();

        //Acceder a la calificación por medio del nombre
        StudentRecord.getGrade();

        //Saber si un alumno exite en la lista
        StudentRecord.isStudentInRecord();

        //Buscar un calificación en el registro
        StudentRecord.searchCalificationByStudent();
    }
}