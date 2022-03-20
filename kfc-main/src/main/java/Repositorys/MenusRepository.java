package Repositorys;

import java.util.List;
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
    public Menu meter(String string, Menu menu) {
        return this.put(string, menu);
    }

    @Override
    public Menu borrarPorK(String string) {
        return this.remove(string);
    }

    @Override
    public Menu buscarPorK(String string) {
        return this.get(string);
    }

    /**
     * @param menu el menú que quieres introducir ya modificado
     * @return devuelve el menú si lo has cosneguido modificar y null si no ha encontrado el menu
     */
    @Override
    public Menu modificar(Menu menu) {
        //todo no entoiendo por que no me funciona el get nombre

        int indice = this.buscarIndicePorK(menu.getNombre());
        
        if(indice>=0){
            this.meter(menu.getNombre(),menu);
        }
        
        return null;
    }

    /**
     *
     * @param s la clave del menu del que quieres obtener un indice
     * @return un int con la posicion del menu y un -1 si no lo encuentra
     */
    public int buscarIndicePorK(String s){
        for (int i = 0; i < this.size(); i++) {

            //todo no entoiendo por que no me funciona el get nombre

            if(this.get(i).getNombre().equals(s) ){
                return i;
            }
        }
        return -1;
    }


    public boolean estaVacia(){
        return this.size()==0;
    }

}
