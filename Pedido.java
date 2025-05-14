import java.util.List;
import java.util.ArrayList;

public class Pedido {

    private int id;
    private List<Articulo> articulos;


    public Pedido(int id) {
        this.id = id;
        this.articulos = new ArrayList<>();
   
    }

    public int getId() {
        return id;
    }

    public void mostrarArticulos() {
        if (articulos.isEmpty()) {
            System.out.println("No hay artículos en el pedido.");
        } else {
            for (Articulo articulo : articulos) {
                articulo.mostrar();
            }
        }
    }
    
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);

    }

 

    public void calcularTotal() {
        double total = 0;
        for (Articulo articulo : articulos) {
            total += articulo.getPrecio();
        }   
        System.out.println("Total del pedido: $" + total);
    }


}
