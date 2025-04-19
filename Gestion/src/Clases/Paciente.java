

public class Paciente {
    private String nombre;
    private String apellido;
    private String edad;
    private int DNI;
    private NivelUrgencia urgencia;

    // Constructor vacío
    public Paciente() {
    }

    // Constructor con parámetros
    public Paciente(String nombre, String apellido, String edad, int DNI, NivelUrgencia urgencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.urgencia = urgencia;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public int getDNI() {
        return DNI;
    }

    public NivelUrgencia getUrgencia() {
        return urgencia;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setUrgencia(NivelUrgencia urgencia) {
        this.urgencia = urgencia;
    }

    // toString
    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad='" + edad + '\'' +
                ", DNI=" + DNI +
                ", urgencia=" + urgencia +
                '}';
    }
}

