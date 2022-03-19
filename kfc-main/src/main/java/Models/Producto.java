package Models;

import java.util.ArrayList;

public class Producto {
    public static int numeroProductos = 0;
    private int  id = 0;
    private String nombre;
    private float precio;
    private Enum tipo;

    public Producto(String nombre, float precio, Enum tipo) {
        this.id = numeroProductos++;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public static int getNumeroProductos() {
        return numeroProductos;
    }


    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
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
}
