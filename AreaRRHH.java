import java.util.ArrayList;
import java.util.List;

public class AreaRRHH extends Area {
    private List<Tecnicos> Lista;

    public AreaRRHH() {
        Lista = new ArrayList<>();
    }

    @Override
    public void mostrarElemento() {
        System.out.println("Mostrando Lista de Tecnicos:");
        for (Tecnicos tecnico : Lista) {
            System.out.println(tecnico);
        }
    }

    public void agregarTecnico(Tecnicos tecnico) {
        Lista.add(tecnico);
    }

    public void eliminarTecnico(Tecnicos tecnico) {
        Lista.remove(tecnico);
    }

    public List<Tecnicos> obtenerListaTecnicos() {
        return Lista;
    }

    public List<Tecnicos> getLista() {
        return Lista;
    }

    public void setLista(List<Tecnicos> lista) {
        Lista = lista;
    }

    public Reporte emitirReporte() {
        Reporte reporteNew = new Reporte();
        return reporteNew;
    }
}
