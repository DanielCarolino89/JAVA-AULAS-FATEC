/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaApplication5;
/**
 *
 * @author aluno.si
 */
public class Carro {
    private int portas = 4;
    private int rodas = 4;
    private String cor = "";
    private String placa = "";
    private boolean gasolina = true;
    //metodos
    
    // imprimir
    public void imprimir(){
        System.out.println("portas: "+portas);
        System.out.println("rodas: "+rodas);
        System.out.println("portas: "+cor);
        System.out.println("placas: "+placa); 
    }
     public static void main(String[] args) 
        {
        // INSTANCIAR UM OBJETO DO TIPO CARRO
        Carro carro1 = new Carro();
        System.out.println("Caracteristicas do carro 1");
        carro1.imprimir();
        
        System.out.println("");
        
        Carro carro2 = new Carro();
        System.out.println("Caracteristicas do carro 2");
        carro2.imprimir();
             
        }
}
   
