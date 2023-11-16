public class Tarea {
   private String descripcion;
   private String fecha;
   private int prioridad;
   private boolean isCompleted;

    public Tarea() {
    }

    public Tarea(String descripcion, String fecha, int prioridad) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.prioridad = prioridad;
        this.isCompleted = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
