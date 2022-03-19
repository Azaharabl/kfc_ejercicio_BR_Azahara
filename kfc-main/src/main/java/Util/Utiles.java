package Util;

import java.util.Scanner;

public class Utiles {
    /**
     *
     * @param mensaje un mensaje que quieres mstrar por consola
     * @return un texto que introduce el cliente, puede ser vacio o null
     */
    public static String pedirString(String mensaje){
        System.out.println("mensaje");
        Scanner sc = new Scanner(System.in);
        String opcion = sc.next();
        return opcion;
    }
}
