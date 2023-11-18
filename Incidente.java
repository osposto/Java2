import java.util.Date;

public class Incidente {
    public int incId;
    public Date fechaInicio;
    public Date fechaFinal;
    public short colchonHs;
    public int clienteId;
    public String descripcion;
    public Incidente(Cliente cli, String description){
        this.fechaInicio = new Date();
        this.colchonHs = 0;
        this.clienteId = cli.cliId;
        this.descripcion = description;
    }
    public int getIncId() {
        return incId;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public Date getFechaFinal() {
        return fechaFinal;
    }
    public short getColchonHs() {
        return colchonHs;
    }
    public int getClienteId() {
        return clienteId;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setIncId(int incId) {
        this.incId = incId;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    public void setColchonHs(short colchonHs) {
        this.colchonHs = colchonHs;
    }
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
