package Models;

public class LineaDeVenta {


    //creo queno necesito la linea de venta porque cada menú se puede modificar

    private int id;
    private Menu menu;
    private int cantidad ;
    private float precio;
    public static int numeroLineas=0;


    public LineaDeVenta(int id, Menu menu, float precio) {
        this.id =numeroLineas++ ;
        this.menu = menu;
        //todo calcular el preocion segun producto y cantidad
        this.precio = precio;
    }

    public int getId() {
        return id;
    }



    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }


    public float getPrecio() {
        float precioLinea = this.menu.getPrecio();
        return precio;
        //todo calcular el preocion segun producto y cantidad
    }


}
