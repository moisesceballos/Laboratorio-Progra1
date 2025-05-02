/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_progra1.semana2;
import java.util.Scanner;

public class Ceballos_Moises_Lab2_Condicionales_Ejercicio3 {
    public static void main(String [] args){
        
        
        /* 
        
        Tarifas por categoría (para horas extra):
        Categoría 1 → $45.00 por hora extra

        Categoría 2 → $40.00 por hora extra

        Categoría 3 → $38.00 por hora extra

        Categoría 4 → no recibe pago extra

        */
        
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter ("\n");
        
        double pagoHoraExtra = 0;
        int horasNormales = 0;
        int horasExtras = 0;
        int horasExtrasPagadas = 0;
        double PAGO_NORMAL = 35.99;
        
        
        System.out.print("Ingrese su nombre y apellido: ");
        String nombreApellido = sc.next();
        System.out.print("Ingrese sus horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        System.out.print("Ingrese su codigo: ");
        int codigoIngresado = sc.nextInt();
        System.out.println("Ingrese su categoria (1-4): ");
        int categoriaIngresada = sc.nextInt();
        
        switch (categoriaIngresada) {
            case 1:
                System.out.println("Su categoria es 1");
                pagoHoraExtra = 45.00 ;
                break; 
            case 2:
                System.out.println("Su categoria es 2");
                pagoHoraExtra = 40.00 ;
                break;
            case 3:
                pagoHoraExtra = 38.00 ;
                System.out.println("Su categoria es 3");
                break;
            case 4: 
                System.out.println("Su categoria es 4");
                pagoHoraExtra = 0.0; // no recibe pago extra
                break;
        }
    
        if (horasTrabajadas <= 40) {
            horasNormales = horasTrabajadas;
            horasExtras = 0;
            horasExtrasPagadas = 0;
        } else {
            horasNormales = 40;
            horasExtras = horasTrabajadas - 40;

            if (horasExtras > 15) {
                horasExtrasPagadas = 15;
            } else {
                horasExtrasPagadas = horasExtras;
            }
        }

        double pagoTotal = (horasNormales * PAGO_NORMAL) + (horasExtrasPagadas * pagoHoraExtra);

        // Imprimir resultados
        System.out.println("\nResumen de pago:");
        System.out.println("Empleado: " + nombreApellido);
        System.out.println("Codigo: " + codigoIngresado);
        System.out.println("Horas normales: " + horasNormales);
        System.out.println("Horas extra: " + horasExtrasPagadas);
        System.out.printf("Total a pagar: $%.2f\n", pagoTotal);
        
    }
    
    
    
    
    
}
