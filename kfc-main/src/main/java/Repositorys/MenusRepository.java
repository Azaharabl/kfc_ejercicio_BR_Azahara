package Repositorys;

import Models.Menu;

import java.util.TreeMap;

public class MenusRepository<Integer,Menu> extends  TreeMap<Integer, Menu> implements IRepository<Integer,Menu> {


    @Override
    public Menu meter(Integer  s, Menu producto) {
        this.put(s,producto);
        return producto;
    }

    @Override
    public Menu borrar(Integer s) {
        return this.remove(s);

    }


    @Override
    public void borrarTodos() {
        this.clear();
    }

    @Override
    public Menu buscar(Integer s) {
        return this.get(s);
    }
}
