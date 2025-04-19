import java.util.Scanner;

public class ActionMenu {
    static CentroEmergencias centro = new CentroEmergencias();

    static void ingresopaciente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Edad: ");
        String edad = scanner.nextLine();

        System.out.print("DNI: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.println("Nivel de urgencia (1: ALTA, 2: MEDIA, 3: BAJA): ");
        int urgenciaNum = scanner.nextInt();

        NivelUrgencia urgencia;
        switch (urgenciaNum) {
            case 1 -> urgencia = NivelUrgencia.ALTA;
            case 2 -> urgencia = NivelUrgencia.MEDIA;
            case 3 -> urgencia = NivelUrgencia.BAJA;
            default -> {
                System.out.println("Nivel de urgencia inválido, se asigna BAJA por defecto.");
                urgencia = NivelUrgencia.BAJA;
            }
        }

        Paciente nuevoPaciente = new Paciente(nombre, apellido, edad, dni, urgencia);
        System.out.println("Paciente ingresado:");
        System.out.println(nuevoPaciente);
    }

    static void altamedico() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("¿Está disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();

        Medico nuevoMedico = new Medico(id, nombre, apellido, disponible);
        System.out.println("Médico dado de alta:");
        System.out.println(nuevoMedico);

    }

    static void reporte() {
    }

    static void atenderpaciente() {
        Paciente paciente = centro.atenderPaciente();
        if (paciente == null) {
            System.out.println("No hay pacientes para atender.");
            return;
        }

    }

    static void asignarmedico() {
    }
}
