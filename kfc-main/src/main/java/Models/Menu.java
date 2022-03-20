package Models;

import Enums.Categoria;

import java.util.ArrayList;


public class Menu {
    public static int numeroMenus = 0;
    private int  id = 0;
    private String nombre;
    private float precio;
    private Categoria tipo;
    private Producto principal;
    private Producto complemento;
    private Producto bebida;

    public Menu(String nombre, Producto principal,Producto complemento, Producto bebida) {
        this.id = numeroMenus++;
        this.nombre = nombre;
        this.principal = principal;
        this.complemento = complemento;
        this.bebida = bebida;
    }

    @Override
    public String toString() {
        return "\n Menu{" +
                "\n id=" + id +
                ", precio=" + precio +
                ", principal=" + principal +
                ", complemento=" + complemento +
                ", bebida=" + bebida +
                '}';
    }

    public int getId() {
        return id;
    }

    public static int getNumeroMenus() {
        return numeroMenus;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        float precioDeMenu = principal.getPrecio()+complemento.getPrecio()+ bebida.getPrecio();
        return precio;
    }

    public Producto getPrincipal() {
        return principal;
    }

    public void setPrincipal(Producto principal) {
        this.principal = principal;
    }

    public Producto getComplemento() {
        return complemento;
    }

    public void setComplemento(Producto complemento) {
        this.complemento = complemento;
    }

    public Producto getBebida() {
        return bebida;
    }

    public void setBebida(Producto bebida) {
        this.bebida = bebida;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Enum getTipo() {
        return tipo;
    }






}
