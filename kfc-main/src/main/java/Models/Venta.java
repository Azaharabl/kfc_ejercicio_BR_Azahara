package Models;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Menu> lineas = new ArrayList();
    private float precio;
    private int id;
    public static int NumeroVentas=0;


    public Venta() {
        this.precio = calcularPrecio(lineas);
        this.id = NumeroVentas++;
    }

    private float calcularPrecio(ArrayList<Menu> lineas) {
        float precio = 0;
        float aux = 0;
        for (int i = 0; i < lineas.size(); i++) {
            aux = lineas.get(i).getPrecio();
            precio+=aux;
        }
        return precio;
    }

    public ArrayList<Menu> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<Menu> lineas) {

        this.lineas = lineas;
    }


    public float getPrecio() {

        return calcularPrecio(lineas);
    }


    public int getId() {
        return id;
    }


    public static int getNumeroVentas() {
        return NumeroVentas;
    }

    public void meterMenuEnLineas(Menu m) {
        this.lineas.add(m);
    }
}
