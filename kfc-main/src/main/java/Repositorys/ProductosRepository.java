package Repositorys;

import Models.Producto;

import java.util.ArrayList;
import java.util.List;
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
    public Producto meter(String s, Producto producto) {
        return this.put(s,producto);
    }

    @Override
    public Producto borrarPorK(String s) {
        return this.remove(s);
    }

    @Override
    public Producto buscarPorK(String s) {
        return this.get(s);
    }

    @Override
    public Producto modificar(Producto pro) {

        Producto p = buscarPorK(pro.getNombre()) ;

        if (p!=null){
            this.remove(p.getNombre());
            return this.meter(pro.getNombre(), pro);
        }
        return null;
    }
}
