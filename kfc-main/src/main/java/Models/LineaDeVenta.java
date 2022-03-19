package Models;

public class LineaDeVenta {
    private int id;
    private Menu menu;
    private int cantidad ;
    private float precio;
    public static int numeroLineas=0;


    public LineaDeVenta(int id, Menu menu, int cantidad, float precio) {
        this.id =numeroLineas++ ;
        this.menu = menu;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
        //todo calcular el preocion segun producto y cantidad
    }


}
