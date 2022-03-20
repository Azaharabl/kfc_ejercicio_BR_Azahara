package Repositorys;

import java.util.List;

public interface IRepository<K,T> {

    List<T> devolverTodos();

    T meter(K k,T t);

    T borrarPorK(K k);

    T buscarPorK(K k);

    T modificar(T entity);




}
