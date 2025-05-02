/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_progra1.semana2;
import java.util.Scanner;

public class Ceballos_Moises_Lab2_Condicionales_Ejercicio4 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");
        
        /*
        
        Hacer un programa que pueda solicitar dos fechas desde el teclado
       (formato de la fecha es Día/Mes/Año) y mostrar el número de días que hay de diferencia.
        Suponiendo todos los meses de 30 días.(Usar substring())
       
        */ 
        
        System.out.print("Ingrese una fecha 1 (DD/MM/YY) ");
        String fecha1 = sc.next();
        System.out.print("Ingrese una fecha 2 (DD/MM/YY) ");
        String fecha2 = sc.next();
        
        int dia1 = Integer.parseInt(fecha1.substring(0,2));
        int mes1 = Integer.parseInt(fecha1.substring(3,5));
        int ano1 = Integer.parseInt(fecha1.substring(6));    
        
        int dia2 = Integer.parseInt(fecha2.substring(0,2));
        int mes2 = Integer.parseInt(fecha2.substring(3,5));
        int ano2 =Integer.parseInt(fecha2.substring(6));
        
        
        int totalDias1 = ano1 * 360 + mes1 * 30 + dia1;
        int totalDias2 = ano2 * 360 + mes2 * 30 + dia2;
        
        int diferencia;
        if (totalDias1 > totalDias2) {
            diferencia = totalDias1 - totalDias2;
        } else {
            diferencia = totalDias2 - totalDias1;
        }

        System.out.println("La diferencia en dias entre las fechas es: " + diferencia );
           
    }
    
}
