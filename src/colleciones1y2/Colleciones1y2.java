/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colleciones1y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class Colleciones1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
    
    ArrayList <String> razas = new ArrayList();
    String aux = "N";
    
    do{
        System.out.println("Escriba una raza de perro");
            razas.add(leer.nextLine());
        System.out.println("Desea seguir agregando razas y salir? Responda S o N");    
            aux = leer.nextLine();
    }while(!"n".equals(aux.toLowerCase()));
    
        System.out.println("Las razas ingresadas son: " + razas.size());
        
       System.out.println("Las razas ingresadas son: ");
       
        for (String r1 : razas) {   
                    System.out.println(r1 + "");
                }
        System.out.println("");
        Iterator<String> it = razas.iterator();
        
        System.out.println("Elija una de las razas ingresadas para eliminar");
        String rz=leer.nextLine();
        
        while (it.hasNext()){
            if(it.next().equalsIgnoreCase(rz)){
                it.remove();
            }
        }
        System.out.println("Las razas que quedaron ingresadas son");
        
        for(String r1 : razas){
             System.out.println(r1 + "");
        }
  }

    }
    
