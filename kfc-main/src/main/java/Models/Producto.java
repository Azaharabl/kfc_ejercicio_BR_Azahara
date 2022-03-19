package Models;

import Enums.Categoria;
import Enums.Tipo;

import java.util.ArrayList;

public class Producto {
    public static int numeroProductos =1;
    private int  id = 0;
    private String nombre;
    private float precio = getPrecio();
    private Tipo tipo;
    private Categoria categoria;

    @Override
    public String toString() {

        return "\n Producto{" +
                "  id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                ", categoria=" + categoria +
                '}';
    }

    public Producto(String nombre, float precio, Categoria categoria , Tipo tipo) {
        this.id = numeroProductos++;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.categoria=categoria;

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


}
