package Repositorys;

import java.util.TreeMap;

public class MenusRepository<String,Menu> extends  TreeMap<String, Menu> implements IRepository<String,Menu> {
    private static MenusRepository instance;

    public MenusRepository getInstance(){
        if(instance == null){
            return new MenusRepository();
        }else{
            return instance;
        }
    }


    @Override
    public void meter(String  s, Menu producto) {
        this.put(s,producto);
    }

    @Override
    public Menu borrar(String s) {
        return this.remove(s);

    }


    @Override
    public void borrarTodos() {
        this.clear();
    }

    @Override
    public Menu buscar(String s) {
        return this.get(s);
    }
}
