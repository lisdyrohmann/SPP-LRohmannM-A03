/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.a03;
import java.util.Scanner;
/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannMA03 {

    /**
     * @param args the command line arguments
     */
     //Función matemática utilizada: "Pow"
    public static void main(String[] args) {
        double c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un cateto");
        double a=sc.nextDouble();
        System.out.println("Ingrese el otro cateto");
        double b=sc.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);
    }
   
    
}
