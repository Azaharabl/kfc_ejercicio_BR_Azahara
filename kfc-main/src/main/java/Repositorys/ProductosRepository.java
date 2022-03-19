package Repositorys;

import Models.Producto;

import java.util.ArrayList;
import java.util.TreeMap;

public class ProductosRepository<Producto> extends TreeMap<String,Producto> implements IRepository<String,Producto> {


    @Override
    public Producto meter(String s, Producto producto) {
        this.put(s,producto);
        return producto;
    }

    @Override
    public Producto borrar(String s) {
            return this.remove(s);

    }


    @Override
    public void borrarTodos() {
        this.clear();
    }

    @Override
    public Producto buscar(String s) {
        return this.get(s);
    }
}
