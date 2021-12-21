/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizadormueble;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class CotizadorMueble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int longitud; //variable resultado de ingreso longitud
        int ancho;//variable resultado de ingreso ancho
        int tipMad;//variable tipo madera
        int cantcaj;//variable cantidad cajones
        
        
        escritorioMueble mueble = new escritorioMueble();//enlace a la clase escritorioMueble

        System.out.println("BIENVIDO AL SISTEMA");
        System.out.println("POR FAVOR INGRESE LOS SIGUIENTES DATOS");
        System.out.println("INGRESE LONGITUD");
        Scanner teclado = new Scanner(System.in);
        longitud = teclado.nextInt();//ingreso un numero de longitud
        mueble.setLongitud(longitud);//obtiene el valor ingresado
        System.out.println("INGRESE ANCHO");
        ancho = teclado.nextInt();//ingreso un numero de ancho
        mueble.setAncho(ancho);//obtiene el valor ingresado
        System.out.println("TOTAL SUPERFICIE ES: " + mueble.superficie()); //resultado de longitud * ancho
        System.out.println("PRECIO ESTANDAR $2000");
        
        System.out.println("SELECCIONE EL NUMERO DE TIPO DE MADERA");
        System.out.println("1-CAOBA +1500");
        System.out.println("2-ROBLE +1250");
        System.out.println("3-PINO +0");
        tipMad=teclado.nextInt();//selecciona la opcion
        mueble.setTipMad(tipMad);
        System.out.println("PRECIO MUEBLE SUBTOTAL: $"+mueble.selecMadera());
        System.out.println("CANTIDAD DE CAJONES A AÑADIR (precio $300)");
        cantcaj=teclado.nextInt();
        mueble.setCantCaj(cantcaj);
        
        
        System.out.println("SUBTOTAL ADICIONAL POR CAJONES: $"+mueble.cajones());
        System.out.println("RECARGO EXCESO SUPERFICIE: $"+mueble.recargo());
        System.out.println("TOTAL: $"+mueble.granTotal());

    }

}
