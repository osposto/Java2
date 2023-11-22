import java.util.ArrayList;

public class AreaComercial extends Area {
    private ArrayList<Clientes> Lista;

    public AreaComercial() {
        Lista = new ArrayList<Clientes>();
    }

    @Override
    public void mostrarElemento() {
        System.out.println("Mostrando Lista de Clientes");
    }

    public ArrayList<Clientes> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Clientes> lista) {
        Lista = lista;
    }

    public void agregarCliente(Clientes cliente) {
        Lista.add(cliente);
    }

    public void eliminarCliente(Clientes cliente) {
        Lista.remove(cliente);
    }

    public ArrayList<Clientes> obtenerListaClientes() {
        return Lista;
    }
}

