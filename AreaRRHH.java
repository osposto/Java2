import java.util.ArrayList;

public class AreaRRHH extends Area {
    private ArrayList<Tecnico> Lista;
    public AreaRRHH() {
        Lista = new ArrayList<Tecnico>();
    }
    @Override
    public void mostarElemento() {
        System.out.println("Mostrando Lista de Tecnicos");
    }
    public void agregarTecnico(Tecnico tecnico) {
        Lista.add(tecnico);
    }
    public void eliminarTecnico(Tecnico tecnico) {
        Lista.remove(tecnico);
    }
    public ArrayList<Tecnico> obtenerListaTecnicos() {
        return Lista;
    }
    public ArrayList<Tecnico> getLista() {
        return Lista;
    }
    public void setLista(ArrayList<Tecnico> lista) {
        Lista = lista;
    }
    public Reporte emitirReporte(){
        Reporte reporteNew = new Reporte();
        return reporteNew;
    }
}
