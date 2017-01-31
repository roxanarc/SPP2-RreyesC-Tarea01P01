/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.tarea01.p01;
import java.util.Scanner;

/**
 *
 * @author falvizo
 */
public class SPP2RreyesCTarea01P01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración de variables
        Scanner keyboard = new Scanner (System.in);
        String mat;
        double cal1;
        double cal2;
        double cal3;
        double cal4;
        double cal5;
        String res;
        double pro;
        
        //Ejecución del programa
        
        System.out.println("Introduce tu matrícula");
        mat = keyboard.nextLine();
        System.out.println("");
        System.out.println("Calificaciones");
        System.out.println("Matematicas 2");
        cal1= keyboard.nextDouble();
        System.out.println("Estatica");
        cal2= keyboard.nextDouble();
        System.out.println("Procesos de Manufactura");
        cal3= keyboard.nextDouble();
        System.out.println("Fisica 2");
        cal4= keyboard.nextDouble();
        System.out.println("Programaion");
        cal5= keyboard.nextDouble();
        
        
        //obtencion de resultados
        pro = (cal2+cal2+cal3+cal4+cal5)/5;
        System.out.println("");
        System.out.println("Promedio="+pro);
        if (pro>=7){
        System.out.println("APROBADO");}
        else {System.out.println("REPROBADO");}
        //cuando ponia else, me marcaba un error//
        
        
        
        
    }
    
}
