package Repositorys;

import Models.Producto;

import java.util.ArrayList;
import java.util.TreeMap;

public class ProductosRepository<Producto> extends TreeMap<String,Producto> implements IRepository<String,Producto> {

    private static ProductosRepository instance;

    public ProductosRepository() {
    }

    public ProductosRepository getInstance(){
        if(instance == null){
            return new ProductosRepository();
        }else {
            return instance;
        }
    }
    @Override
    public void meter(String s, Producto producto) {
        this.put(s,producto);
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
