import java.util.ArrayList;

public class AreaComercial extends Area {
    private ArrayList<Cliente> Lista;

    public AreaComercial() {
        Lista = new ArrayList<Cliente>();
    }
    @Override
    public void mostarElemento() {
        System.out.println("Mostrando Lista de Clientes");
    }
    public ArrayList<Cliente> getLista() {
        return Lista;
    }
    public void setLista(ArrayList<Cliente> lista) {
        Lista = lista;
    }
    public void agregarCliente(Cliente cliente) {
        Lista.add(cliente);
    }
    public void eliminarCliente(Cliente cliente) {
        Lista.remove(cliente);
    }
    public ArrayList<Cliente> obtenerListaClientes() {
        return Lista;
    }
}
