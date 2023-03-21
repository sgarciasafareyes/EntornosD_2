package utilidades;

import lombok.Data;
import modelos.Producto;
import java.util.ArrayList;
import java.util.List;

@Data
public class TiendaOnline {
    private List<Producto> productos;

    public TiendaOnline() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
    }

    public List<Producto> buscarProducto(String terminoBusqueda) {
        List<Producto> resultados = new ArrayList<>();
        for (Producto producto : this.productos) {
            if (producto.getTitulo().contains(terminoBusqueda)) {
                resultados.add(producto);
            }
        }
        return resultados;
    }
}