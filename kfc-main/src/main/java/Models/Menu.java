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
        //todo calcular el preocion segun producto y cantidad
        //todo calcular categoria segun producto

        this.tipo = tipo;
        this.principal = principal;
        this.complemento = complemento;
        this.bebida = bebida;
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
