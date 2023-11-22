public class Operador {

    private String nombre;
    private String apellido;
    private int opId;

    public Operador() {
        // Constructor por defecto
    }

    // Getters y setters para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters para apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Getters y setters para opId
    public int getOpId() {
        return opId;
    }

    public void setOpId(int opId) {
        this.opId = opId;
    }

    public void altaIncidente() {
        // Implementación para dar de alta un incidente
    }

    public void requerirIdCliente(Clientes cliente) {
        // Implementación para requerir el ID del cliente
    }

    public void adqRazonSocial(Clientes cliente) {
        // Implementación para adquirir la razón social del cliente
    }

    public void adqCuitCuil(Clientes cliente) {
        // Implementación para adquirir el CUIT/CUIL del cliente
    }

    public void adqServicioAfectado(Apps_y_SO servicioAfectado) {
        // Implementación para adquirir el servicio afectado
    }

    public void adqDescripcionProblema(Incidente incidente) {
        // Implementación para adquirir la descripción del problema
    }

    public void selecTec(Tecnicos tecnico) {
        // Implementación para seleccionar un técnico
    }

    public void informarCliente(Incidente incidente) {
        // Implementación para informar al cliente sobre un incidente
    }

    public void informarTec() {
        // Implementación para informar al técnico
    }
}
