/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

/**
 *
 * @author Usuario
 */
public class PrimeraParte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double resultadoSuma = sumaTresNumeros(3,4.5,5.3);
        System.out.println(resultadoSuma);
        
    }
    
    public static double sumaTresNumeros (double num1, double num2, double num3){
        double suma = num1 + num2 + num3;
        return suma;
    }
}
