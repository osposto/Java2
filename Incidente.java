import java.util.Date;

public class Incidente {
    private int incId;
    private Date fechaInicio;
    private Date fechaFinal;
    private short colchonHs;
    private int clienteId;
    private String descripcion;

    public Incidente(Clientes cli, String description) {
        this.fechaInicio = new Date();
        this.colchonHs = 0;
        this.clienteId = Integer.parseInt(cli.getClienteId());
        this.descripcion = description;
    }

    public int getIncId() {
        return incId;
    }

    public void setIncId(int incId) {
        this.incId = incId;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public short getColchonHs() {
        return colchonHs;
    }

    public void setColchonHs(short colchonHs) {
        this.colchonHs = colchonHs;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}


