
package ejercicio2;
import java.util.Locale;
import java.util.Scanner;





public class Ejercicio2 {

    public static void main(String[] args) {
        
        
Scanner teclado = new Scanner(System.in); 
     teclado.useLocale(Locale.ENGLISH);//para poner altura con punto 
    
    String nom;
    int edad;
    char sexo;
    float peso,alt;
   Persona p2=new Persona(); 
 
  System.out.println("Ingrese su nombre:"); 
  nom = teclado.nextLine();
  System.out.println("Ingrese edad:"); 
  edad = teclado.nextInt(); 
  
  System.out.println("Ingrese su sexo:"); 
  System.out.println("Opciones: (M)Mujer // (H)Hombre // (I)Indeterminado");
  sexo=teclado.next().toLowerCase().charAt(0);
  System.out.println("sexo es:"+p2.comprobarSexo(sexo));
   while ((sexo=='M') || (sexo=='H') || (sexo=='I'))
           {
            
              
           }
  System.out.print("Ingrese peso:");
  peso = teclado.nextFloat();
  System.out.print("Ingrese altura:");
  alt = teclado.nextFloat();
  

   Persona p= new Persona(nom,edad,peso,alt,sexo);
  
   System.out.println("*-1:Desnutrición *1:Sobrepeso *0:Peso Normal Su IMC es:"+p.calcularIMC());
   System.out.println(""+p.esMayorDeEdad());
   System.out.println(p.toString());
   
    }
    
}

    

