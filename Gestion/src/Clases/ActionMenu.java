import java.util.List;
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

        int dni;
        boolean dniDuplicado;
        do {
            System.out.print("DNI: ");
            dni = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Verificar si ya existe un paciente con ese DNI
            dniDuplicado = false;
            for (Paciente paciente : centro.getPacientes()) {
                if (paciente.getDNI() == dni) {
                    System.out.println("Ya existe un paciente con el DNI " + dni);
                    System.out.print("Por favor, ingrese un nuevo DNI: ");
                    dniDuplicado = true;
                    break; // Salir del bucle for y pedir DNI nuevamente
                }
            }
        } while (dniDuplicado);  // Continuar hasta que se ingrese un DNI único

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
        // Agregar el paciente al centro
        centro.agregarPaciente(nuevoPaciente);
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
        centro.registrarMedico(nuevoMedico);
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
        }else {
            System.out.println("Paciente atendido y en espera de médico:");
            System.out.println(paciente);
        }
    }

    static void asignarmedico() {
        List<Paciente> enEspera = centro.getPacientesEnEsperaDeMedico();

        if (enEspera.isEmpty()) {
            System.out.println("No hay pacientes en espera de médico.");
            return;
        }

        Medico medico = centro.buscarMedicoDisponible();

        if (medico != null) {
            Paciente paciente = enEspera.get(0); // Asignar el primer paciente en espera
            System.out.println("Asignando el médico " + medico.getNombre() + " " + medico.getApellido() + " al paciente " + paciente.getNombre() + " " + paciente.getApellido());
            centro.quitarPacienteEnEspera(paciente);
        } else {
            System.out.println("No hay médicos disponibles.");
        }
    }
}
