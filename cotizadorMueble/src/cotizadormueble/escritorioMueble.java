/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizadormueble;

/**
 *
 * @author Oscar
 */
public class escritorioMueble {
    private int longitud;
    private int ancho;
    private int tipMad;
    private int precioMad;
    private int cantCaj;

    public int getPrecioMad() {
        return precioMad;
    }

    public void setPrecioMad(int precioMad) {
        this.precioMad = precioMad;
    }

    public int getCantCaj() {
        return cantCaj;
    }

    public void setCantCaj(int cantCaj) {
        this.cantCaj = cantCaj;
    }

    public int getTipMad() {
        return tipMad;
    }

    public void setTipMad(int tipMad) {
        this.tipMad = tipMad;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public int superficie(){ //METODO PARA CALCULAR LA SUPERFICIE
        int rst;
        
        rst=longitud*ancho;
                        
        return rst;
    } 
    
    public int selecMadera() { //Lista valor minimo + valor tipo madera

        switch (tipMad) {
            case 1:
                precioMad = 2000 + 1500;//Precio minimo + precio Caoba
                break;
            case 2:
                precioMad = 2000 + 1250;//Precio minimo + precio Roble
                break;
            case 3:
                precioMad = 2000;
            break;
            default:
                System.out.println("VALOR INCORRECTO");
        } return precioMad;
    }
    public int cajones(){ //calculo cajones
        int rstc;
        rstc=cantCaj*300;
        return rstc;
    }
    
    public int recargo(){ //regla adicional
        int adicsup =longitud*ancho;
        int totadic;
     
        if (adicsup>4000) {
            totadic=50;
        } else {
        totadic=0;
        }
        
        return totadic;
    }
    
    public int granTotal(){ //sumatoria total
        int grt;
        
        grt=getPrecioMad()+recargo()+cajones();
        return grt;
    }
}
