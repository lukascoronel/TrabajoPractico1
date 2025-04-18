

public class Paciente {
    public Paciente() {
    }

    String nombre, apellido, edad;
    int DNI;
    int urgencia;

    public Paciente(String nombre, String apellido, int DNI, int urgencia) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.DNI = DNI;
    this.urgencia = urgencia;
    }
}
