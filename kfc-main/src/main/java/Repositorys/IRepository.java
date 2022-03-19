package Repositorys;

public interface IRepository<K,T> {
    T meter(K k,T t);
    T borrar(K k);
    void borrarTodos();
    T buscar(K k);

}
