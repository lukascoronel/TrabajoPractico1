

public class Medico {
    private int id;
    private String nombre;
    private String apellido;
    private boolean disponible;

    // Constructor vacío
    public Medico() {
    }

    // Constructor con parámetros
    public Medico(int id, String nombre, String apellido, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.disponible = disponible;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // toString
    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", disponible=" + (disponible ? "Sí" : "No") +
                '}';
    }
}
