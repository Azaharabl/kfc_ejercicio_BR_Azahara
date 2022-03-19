package Main;

import Controler.ControlesKFC;
import Util.Utiles;

import java.io.Console;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Controler.ControlesKFC.getInstancia;

public  class Main{
     private static  final ControlesKFC c = getInstancia();

    public static void main(String[] args){


        mensajeInicioPrograma();

        correrPrograma();

        mensajeFinalPrograma();



    }

    /**
     * @description Menú de el programa kfc y ejecucion
     */
    private static void correrPrograma() {



        // crear productos y menús para poder iniciar el programa


        do {
            //imprimir eleciones


            System.out.println(" \n Las opciones que puedes elegir son: ");
            System.out.println("1. Añadir un menú a la venta. ");
            System.out.println("2. Borrar un menú de la venta. ");
            System.out.println("3. Borrar todos los menús de la venta. ");
            System.out.println("4. Confirmar la venta y proceer al pago. ");
            System.out.println("5. Salir del programa kFC. ");
            System.out.println();

            //pedir opcion

            String opcion = Utiles.pedirString("Seleciona del 1 al 5").trim();

            Pattern patron = Pattern.compile("[1-5]");
            Matcher mat =patron.matcher(opcion);

            if(mat.matches()){
                switch (opcion){
                        case"1":
                            System.out.println("1. Añadir un menú a la venta.");
                            addMenú();
                        break;
                        case"2":
                            System.out.println("2. Borrar un menú de la venta.");
                            borrarMenu();
                            break;

                        case "3":
                                System.out.println("3. Modificar un menú de tu venta.");
                                modificarMenu();
                                break;
                         case "4":
                             System.out.println("4. Confirmar la venta y proceer al pago. ");
                              confirmarVenta();
                        break;
                        case "5":
                             System.out.println("4. Salir del programa. ");
                              salir();
                        break;




                }
            }else {
                System.out.println("Eleción no valida");
            }



        }while(true);

        //


    }

    private static void addMenú() {
    }

    private static void salir() {
        System.out.println("Salio del programa");
        System.exit(0);
    }

    private static void confirmarVenta() {
        System.out.println("Eleción no disponible");

    }

    private static void modificarMenu() {
        System.out.println("Eleción no disponible");
    }

    private static void borrarMenu() {
        System.out.println("Eleción no disponible");
    }



    private static void mensajeFinalPrograma() {
        System.out.println("Finalizaste el programa kfc");
    }

    private static void mensajeInicioPrograma() {
        System.out.println("Comenzaste el inicio del programa kfc");
        ControlesKFC c = getInstancia();
    }
}
