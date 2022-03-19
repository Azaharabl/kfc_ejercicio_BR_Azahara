package Models;

import java.util.ArrayList;


public class Menu {
    public static int numeroMenus = 0;
    private int  id = 0;
    private String nombre;
    private float precio;
    private Enum tipo;
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Menu(String nombre, float precio, Enum tipo, ArrayList<Producto> listaProductos) {
        this.id = numeroMenus++;
        this.nombre = nombre;
        //todo calcular el preocion segun producto y cantidad
        this.precio = precio;
        this.tipo = tipo;
        this.listaProductos = listaProductos;
    }

    public int getId() {
        return id;
    }

    public static int getNumeroMenus() {
        return numeroMenus;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        //todo calcular el preocion segun producto y cantidad
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
