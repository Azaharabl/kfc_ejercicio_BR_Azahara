package Repositorys;

public interface IRepository<T> {
    T crear();
    T borrar(T t);
    T modificar(T t);
    void borrarTodos();
    T buscar(T t);

}
