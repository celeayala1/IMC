
package ejercicio2;


public class Persona {
    private String nom;
 private int edad;
 private char sexo;
 private float peso;
 private float alt;
 

 //construtor por defecto,quiere decir sin parametros
    public Persona()
    {
        this.nom = "";
        this.edad = 0;
        this.sexo = 'I';
        this.peso = 0;
        this.alt = 0;

    }
//Un constructor con el nombre, edad y sexo
    public Persona(String nom, int edad,char sexo)
    {
        this.nom = nom;
        this.edad = edad;
        this.sexo = sexo;
    }
//Un constructor con todos los atributos como parámetro
    public Persona(String nom, int edad, float peso, float alt,char sexo)
    {
        this.nom = nom;
        this.edad = edad;
        this.peso = peso;
        this.alt = alt;
        this.sexo = sexo;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }

   public void setSexo(char sexo) {
        this.sexo = sexo;
    }

   public int calcularIMC () 
   {
    
   int dev=0;
   float imc=(peso/(alt*alt));
    
    if(imc<=18.5)
    {
    dev=-1;
    
    }
    
   else if(imc>=18.5 || imc<=25)
    {
        dev=0;
    }
   
    else if(imc>=25)
    {
    dev=1;
  
    }
    
    
    return dev;
    }

    public boolean esMayorDeEdad ()
    {
    boolean mayor;
   
    if(edad>18)
    {
    mayor=true;
    }
    else
    {
    mayor=false;
    }
   return mayor;
    }
    
   public char comprobarSexo(char sexo)
   {
   if(! (sexo=='M'||sexo=='H'||sexo=='m'||sexo=='h'))
   {
       
     sexo='I';  
   }
   
   return Character.toUpperCase(sexo);//devuelve siempre una mayuscula auunque ingrese m o M

   }
    
    public String toString ()
    {
        return "su nombre es "+nom+" con "+edad+" años,su sexo es "+sexo+" su peso es " +peso+" y su altura "+alt;
      
    }
    
    
    
    
    
    
    
    
}

    

