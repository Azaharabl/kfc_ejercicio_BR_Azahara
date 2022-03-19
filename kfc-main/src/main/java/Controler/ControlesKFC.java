package Controler;

import Enums.Categoria;
import Enums.Tipo;
import Models.Menu;
import Models.Producto;
import Repositorys.MenusRepository;
import Repositorys.ProductosRepository;

import java.util.ArrayList;

import static java.awt.SystemColor.menu;

public class ControlesKFC {
    // contiene su instancia y el repositorio a manejar
    private static ControlesKFC instance;
    private ProductosRepository<Producto> productosRepository;
    private MenusRepository menuRepository;

    //constructor
    public ControlesKFC(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    //sigleton, instancia
    public static ControlesKFC getInstancia() {
        if(instance == null){
            return  new ControlesKFC(new ProductosRepository());
        }else{
            return instance;
        }
    }

     private void iniciarDatosDelRepositorio()
     {

        //iniciamos repositorio de productos con productos

        Producto p = new Producto("alitas",3.50f, Categoria.Normal, Tipo.Complemento);
         this.productosRepository.meter( p.getNombre(),p);
         p = new Producto("hamburguesa",4.80f, Categoria.Normal, Tipo.Principal);
         this.productosRepository.meter( p.getNombre(),p);

         p = new Producto("ensalada cesar",3.90f, Categoria.Normal, Tipo.Complemento);
         this.productosRepository.meter( p.getNombre(),p);



         p = new Producto("hamburguesa deluxe",5.35F, Categoria.Especial, Tipo.Principal);
         this.productosRepository.meter( p.getNombre(),p);
         p = new Producto("patatas deluxe",4.60f, Categoria.Especial, Tipo.Complemento);
         this.productosRepository.meter( p.getNombre(),p);
         p = new Producto("ensalada premium",6.85f,  Categoria.Especial, Tipo.Principal);
         this.productosRepository.meter( p.getNombre(),p);



         p = new Producto("patatas",3.50f,  Categoria.Vegetariano, Tipo.Complemento);
         this.productosRepository.meter( p.getNombre(),p);
          p = new Producto("nuguest queso",2.00f, Categoria.Vegetariano, Tipo.Complemento);
         this.productosRepository.meter( p.getNombre(),p);
         p = new Producto("hamburguesa de esparragos",4.80f, Categoria.Vegetariano, Tipo.Principal);
         this.productosRepository.meter( p.getNombre(),p);
         p = new Producto("ensalada vegeal",4.85f,  Categoria.Vegetariano, Tipo.Principal);
         this.productosRepository.meter( p.getNombre(),p);


         p = new Producto("zumo",1.50f,  Categoria.Vegetariano, Tipo.Bebida);
         this.productosRepository.meter( p.getNombre(),p);
         p = new Producto("cocacola",3.50f, Categoria.Vegetariano, Tipo.Bebida);
         this.productosRepository.meter( p.getNombre(),p);
         p = new Producto("agua",3.50f, Categoria.Vegetariano, Tipo.Bebida);
         this.productosRepository.meter( p.getNombre(),p);

         //iniciamos menus del repositorio

         Menu m = new Menu("clasico",
                 productosRepository.buscar("hamburguesa"),
                 productosRepository.buscar("patatas"),
                 productosRepository.buscar("cocacola"));
         menuRepository.meter(m.getNombre(),m);

         m = new Menu("vegetariano",
                 productosRepository.buscar("hamburguesa de esparragos"),
                 productosRepository.buscar("patatas"),
                 productosRepository.buscar("cocacola"));
         menuRepository.meter(m.getNombre(),m);

          m = new Menu("especial",
                 productosRepository.buscar("hamburguesa deluxe"),
                 productosRepository.buscar("patatas"),
                 productosRepository.buscar("cocacola"));
         menuRepository.meter(m.getNombre(),m);

    }
}
