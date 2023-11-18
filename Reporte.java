import java.util.Date;
public class Reporte {
    public int reporteId;
    public int incidenteId;
    public int clienteId;
    public int tecnicoId;
    public Date fecha;
    public short tiempoResol;
    public boolean estadoResol;
    public String informeTecnico;
    public int getReporteId() {
        return reporteId;
    }
    public int getIncidenteId() {
        return incidenteId;
    }
    public int getClienteId() {
        return clienteId;
    }
    public int getTecnicoId() {
        return tecnicoId;
    }
    public Date getFecha() {
        return fecha;
    }
    public short getTiempoResol() {
        return tiempoResol;
    }
    public boolean isEstadoResol() {
        return estadoResol;
    }
    public String getInformeTecnico() {
        return informeTecnico;
    }
    public void setReporteId(int reporteId) {
        this.reporteId = reporteId;
    }
    public void setIncidenteId(int incidenteId) {
        this.incidenteId = incidenteId;
    }
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    public void setTecnicoId(int tecnicoId) {
        this.tecnicoId = tecnicoId;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setTiempoResol(short tiempoResol) {
        this.tiempoResol = tiempoResol;
    }
    public void setEstadoResol(boolean estadoResol) {
        this.estadoResol = estadoResol;
    }
    public void setInformeTecnico(String informeTecnico) {
        this.informeTecnico = informeTecnico;
    }
}
