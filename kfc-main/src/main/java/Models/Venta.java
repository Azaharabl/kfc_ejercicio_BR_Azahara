package Models;

import java.util.ArrayList;

public class Venta {
    private ArrayList<LineaDeVenta> lineas = new ArrayList<LineaDeVenta>();
    private float precio;
    private int id;
    public static int NumeroVentas=0;

    public Venta(ArrayList<LineaDeVenta> lineas, float precio, int id) {
        this.lineas = lineas;
        //todo hacer el precio calculado autonumericamente
        this.precio = precio;
        this.id = NumeroVentas++;
    }

    public ArrayList<LineaDeVenta> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaDeVenta> lineas) {
        this.lineas = lineas;
    }

    public float getPrecio() {
        //todo calcular el preocion segun producto y cantidad
        return precio;
    }


    public int getId() {
        return id;
    }


    public static int getNumeroVentas() {
        return NumeroVentas;
    }

}
