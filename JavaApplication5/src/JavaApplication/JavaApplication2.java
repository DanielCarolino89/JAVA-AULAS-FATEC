/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author aluno.si
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //entrada de dados
        Scanner sc = new Scanner(System.in);
        
        int x; // vari�vel do tipo int
        double d ;
        String s ;
       
        System.out.println(" Digite um valor inteiro");
        x = sc.nextInt();
        
        System.out.println(" Digite um valor double");
        d = sc.nextDouble();
        
         System.out.println(" Digite um texto");
        s = sc.next(); 
    }
    
}
