import java.util.ArrayList;

public abstract class Area {
    protected ArrayList<Object> Lista;
    public Area() {
        Lista = new ArrayList<>();
    }
    public abstract void mostarElemento();
    public void agregarElemento(Object elemento) {
        Lista.add(elemento);
    }
    public void eliminarElemento(Object elemento) {
        Lista.remove(elemento);
    }
    public int obtenerTamanio() {
        return Lista.size();
    }
}
