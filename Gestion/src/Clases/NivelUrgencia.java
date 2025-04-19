public enum NivelUrgencia {
    ALTA(1),
    MEDIA(2),
    BAJA(3);

    private final int prioridad;

    NivelUrgencia(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
