/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Libro;
import java.net.Socket;
import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           //declaramos variables
    String Generodellibro="";
    int cantidaddelibros=0;
    int añodepublicacion=0;
    
    //crear objetos
    Libro objlibro=new Libro();
    Scanner scan=new Scanner (System.in);
            
    //ingreso por teclado
        System.out.println("digite el genero del libro");
        Generodellibro=scan.nextLine();
        objlibro.setGenerodellibto(Generodellibro);
        
        System.out.println("digite la cantidad de libros");
        cantidaddelibros=scan.nextInt();
        objlibro.setCantidaddelibros(cantidaddelibros);
        
        System.out.println("digite el año de publicacion");
        añodepublicacion=scan.nextInt();
        objlibro.setAñodepublicacion(añodepublicacion);
        
        System.out.println("el genero del libro es:"+ "\t"+objlibro.getGenerodellibto());
        System.out.println("la canntidad de libros es:"+ "\t"+objlibro.getCantidaddelibros());
        System.out.println("el año de publicacion:"+ "\t"+objlibro.getAñodepublicacion());
        
    }
}
