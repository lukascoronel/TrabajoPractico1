import java.util.*;
public class CentroEmergencias {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Paciente> pacientesEnEsperaDeMedico;

    public CentroEmergencias() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.pacientesEnEsperaDeMedico = new ArrayList<>();
    }

    // Agregar paciente
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    // Registrar médico
    public void registrarMedico(Medico medico) {
        medicos.add(medico);
    }

    // Obtener paciente más urgente y eliminarlo de la lista
    public Paciente atenderPaciente() {
        if (pacientes.isEmpty()) return null;

        pacientes.sort(Comparator.comparingInt(p -> p.getUrgencia().getPrioridad()));
        Paciente siguiente = pacientes.remove(0);

        pacientesEnEsperaDeMedico.add(siguiente);
        return siguiente;
    }

    // Buscar médico disponible
    public Medico buscarMedicoDisponible() {
        for (Medico medico : medicos) {
            if (medico.isDisponible()) {
                medico.setDisponible(false); // lo marcamos como ocupado
                return medico;
            }
        }
        return null;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public List<Paciente> getPacientesEnEsperaDeMedico() {
        return pacientesEnEsperaDeMedico;
    }

    // Quitar paciente de la lista de espera una vez asignado
    public void quitarPacienteEnEspera(Paciente paciente) {
        pacientesEnEsperaDeMedico.remove(paciente);
    }

    }

