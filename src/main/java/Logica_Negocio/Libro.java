/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author user
 */
public class Libro {
     //atributos
    public String Generodellibro;
    public int cantidaddelibros;
    public int añodepublicacion;
    
    //constructor no parametrizado
   public Libro (){
}
   //construtor parametrizado

    public Libro(String Generodellibto, int cantidaddelibros, int añodepublicacion) {
        this.Generodellibro = Generodellibto;
        this.cantidaddelibros = cantidaddelibros;
        this.añodepublicacion = añodepublicacion;
    }

    public void setGenerodellibto(String Generodellibto) {
        this.Generodellibro = Generodellibto;
    }

    public void setCantidaddelibros(int cantidaddelibros) {
        this.cantidaddelibros = cantidaddelibros;
    }

    public void setAñodepublicacion(int añodepublicacion) {
        this.añodepublicacion = añodepublicacion;
    }

    public String getGenerodellibto() {
        return Generodellibro;
    }

    public int getCantidaddelibros() {
        return cantidaddelibros;
    }

    public int getAñodepublicacion() {
        return añodepublicacion;
    }
   
}

