public class Tecnicos {

    private String tecId;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private Apps_y_SO capacidades;

    public Tecnicos() {
        
    }

    public String getTecId() {
        return tecId;
    }

    public void setTecId(String tecId) {
        this.tecId = tecId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Apps_y_SO getCapacidades() {
        return capacidades;
    }

    public void setCapacidades(Apps_y_SO capacidades) {
        this.capacidades = capacidades;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "tecId='" + tecId + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", capacidades=" + capacidades +
                '}';
    }
}
