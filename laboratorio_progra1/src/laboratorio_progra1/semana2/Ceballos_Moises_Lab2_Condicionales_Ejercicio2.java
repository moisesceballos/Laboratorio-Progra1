/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_progra1.semana2;

import java.util.Scanner;

public class Ceballos_Moises_Lab2_Condicionales_Ejercicio2 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");
        
        
        System.out.print("Ingrese un numero en segundos ");
        int numeroIngresado = sc.nextInt();
        
        
        String resultado = (numeroIngresado > 0)
            ? (
                (numeroIngresado / 3600) + " horas, " +
                ((numeroIngresado % 3600) / 60) + " minutos, " +
                (numeroIngresado % 60) + " segundos"
            )
            : "No se permite ese valor";

        System.out.println(resultado);
    }
}
        
        
        
    

