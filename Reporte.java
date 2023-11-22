import java.util.Date;

public class Reporte {
    private int reporteId;
    private int incidenteId;
    private int clienteId;
    private int tecnicoId;
    private Date fecha;
    private short tiempoResol;
    private boolean estadoResol;
    private String informeTecnico;

    public Reporte() {
        
    }

    public int getReporteId() {
        return reporteId;
    }

    public void setReporteId(int reporteId) {
        this.reporteId = reporteId;
    }

    public int getIncidenteId() {
        return incidenteId;
    }

    public void setIncidenteId(int incidenteId) {
        this.incidenteId = incidenteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getTecnicoId() {
        return tecnicoId;
    }

    public void setTecnicoId(int tecnicoId) {
        this.tecnicoId = tecnicoId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public short getTiempoResol() {
        return tiempoResol;
    }

    public void setTiempoResol(short tiempoResol) {
        this.tiempoResol = tiempoResol;
    }

    public boolean isEstadoResol() {
        return estadoResol;
    }

    public void setEstadoResol(boolean estadoResol) {
        this.estadoResol = estadoResol;
    }

    public String getInformeTecnico() {
        return informeTecnico;
    }

    public void setInformeTecnico(String informeTecnico) {
        this.informeTecnico = informeTecnico;
    }
}

