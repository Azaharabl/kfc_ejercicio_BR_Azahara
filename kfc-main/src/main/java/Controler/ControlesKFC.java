package Controler;

import Enums.Categoria;
import Enums.Tipo;
import Models.Menu;
import Models.Producto;
import Models.Venta;
import Repositorys.MenusRepository;
import Repositorys.ProductosRepository;
import Util.Utiles;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.menu;

public class ControlesKFC {
    // contiene su instancia y el repositorio a manejar
    private static ControlesKFC instance;
    private ProductosRepository<Producto> productosRepository = new ProductosRepository();
    private MenusRepository<String,Menu> menuRepository = new MenusRepository();
    private Venta venta = new Venta();

    //constructor


    public ControlesKFC() {

    }

    //sigleton, instancia
    public static ControlesKFC getInstancia() {
        if(instance == null){
            return  new ControlesKFC();
        }else{
            return instance;
        }
    }

    public void iniciarDatosDelRepositorio() {

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
         menuRepository.meter("clasico",m);

         Menu s = new Menu("vegetariano",
                 productosRepository.buscar("hamburguesa de esparragos"),
                 productosRepository.buscar("patatas"),
                 productosRepository.buscar("cocacola"));
         menuRepository.meter(s.getNombre(),s);

          Menu a = new Menu("especial",
                 productosRepository.buscar("hamburguesa deluxe"),
                 productosRepository.buscar("patatas"),
                 productosRepository.buscar("cocacola"));
         menuRepository.meter(a.getNombre(),a);

        System.out.println("IMPRIMIMOS MENUS Y PRODUCTOS");
        System.out.println(menuRepository);
        System.out.println(productosRepository);
    }

    public void addMenuAVenta(String opcion){


        Menu m ;
        if(opcion.equalsIgnoreCase("1")){
            //TODO AQUI FALLA porque el menu repositorY esta vacio, devo de haber creado otro
            m= this.menuRepository.get("clasico");
            System.out.println(m);

        }else if(opcion.equalsIgnoreCase("2")){
            m=menuRepository.buscar("vegetariano");
            System.out.println(m);

        }else{
            m=menuRepository.buscar("especial");
            System.out.println(m);
        }

        venta.meterMenuEnLineas(m);


    }

    public void borrarMenu() {

        boolean ok = false;
        if(venta.getLineas().size()!=0){
            try {
                Menu menu =selecionarUnMenuDeLista();
                ok = true;
            } catch (Exception e){
                System.out.println(" Error: no hay ese menú en tu venta ");
            }

            if(!ok){
                System.out.println(" Error: no hay ese menú en ti venta ");
            }else{
                venta.getLineas().remove(menu);
                System.out.println("Realizado: menú borrado");
            }
        }else{
            System.out.println("Error : tu aun no tienes ningun menú en tu venta");
        }

    }

    public Menu selecionarUnMenuDeLista()throws Exception {

        int numeroMenus = venta.getLineas().size();


            System.out.println("los menús que tienes en este momento son : ");

            for (int i = 0; i < numeroMenus; i++) {
                System.out.println("menú " + i + venta.getLineas().get(i));
            }

            System.out.println("elige un menú a borrar entre la opcion 1 y " + numeroMenus);

            String opcion = Utiles.pedirString("");

            Pattern p = Pattern.compile("/d");
            Matcher m = p.matcher(opcion);

            int opcionNumerica = Integer.parseInt(opcion);


            return venta.getLineas().get(opcionNumerica);



    }

    public void modificarMenu(Menu m) {
        //imprimir menu
        System.out.println("el menú que quieres modificar es :");
        System.out.println(m);
        System.out.println("quieres modificar : ");
        System.out.println("1. Plato principal ");
        System.out.println("2. Acompañamiento ");
        System.out.println("3. Bebida ");

        //selecionar que quieres modificar imprimir opciones de plato
        Tipo tipo ;

        String opcion = Utiles.pedirString("Seleciona del 1 al 3").trim();
        Pattern patron = Pattern.compile("[1-3]");
        Matcher mat =patron.matcher(opcion);

        if (mat.matches()){
            switch(opcion){
                case"1":
                    System.out.println("has eleigo cambiar el Plato principal");
                    tipo= Tipo.Principal;
                    break;
                case "2":
                    System.out.println("has eleigo cambiar el complemento");
                    tipo= Tipo.Complemento;
                    break;
                    default:
                        tipo= Tipo.Bebida;
                        System.out.println("has eleigo cambiar la bebida");

            }
            // imprimir y selecionar por que lo quieres modificar
            int size =productosRepository.size();
            for (int i = 0; i < size; i++) {
                if (productosRepository.get(i).getTipo().equals(tipo) )
                System.out.println("el producto "+ i + " es: ");
                System.out.println(productosRepository.get(i));
            }
            System.out.println("seleciona la opcion del 0 al "+ size);
             opcion = Utiles.pedirString("").trim();
             patron = Pattern.compile("/d+");
             mat =patron.matcher(opcion);

            if (mat.matches()){
                int opcionNumerica = Integer.parseInt(opcion);
                if(productosRepository.get(opcionNumerica).getTipo().equals(tipo)){
                    if(tipo.equals(Tipo.Bebida)){
                        m.setBebida(productosRepository.get(opcionNumerica));

                    }else if(tipo.equals(Tipo.Principal)){
                        m.setPrincipal(productosRepository.get(opcionNumerica));
                    }else{
                        m.setComplemento(productosRepository.get(opcionNumerica));
                    }
                }
            }else {
                System.out.println("tu opcion no es correcta volvemos al menú ");
            }





            //ver si es posible y cambiarlo

        }else{
            System.out.println("la elecion no ha sido correcta volvemos al menú");
        }


    }

}
