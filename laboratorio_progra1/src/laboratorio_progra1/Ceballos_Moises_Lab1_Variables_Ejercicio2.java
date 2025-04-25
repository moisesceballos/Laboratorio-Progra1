
package laboratorio_progra1;
import java.util.Scanner;

/*
**** CUOTAS MENSUALES *******
Cuota de Pago Mensual: HNL ###.##
Total a Pagar: HNL ###.##
*/


public class Ceballos_Moises_Lab1_Variables_Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in); 
        sc.useDelimiter("\n");
        
        System.out.println("Favor ingrese el monto de prestamo otorgado al cliente");
        double monto_prestamo = sc.nextDouble();
        System.out.println("Favor ingrese el plazo de prestamo en MESES");
        double plazo_prestamo = sc.nextDouble();
        System.out.println("Favor ingrese el interes mensual en porcentaje");
        double interes_mensual_porcentaje = sc.nextDouble();
        double interes_mensual_decimal = interes_mensual_porcentaje / 100 ;
        System.out.println("Favor ingrese la comision fija por cada cuota");
        double comision_fija_x_cuota = sc.nextDouble();
        System.out.println("Favor ingrese porcentaje de seguro mensual aplicado a la cuota");
        double seguro_mensual_porcentaje = sc.nextDouble();
        double seguro_mensual_decimal = seguro_mensual_porcentaje / 100 ;
        
        double interes_total_simple = monto_prestamo * interes_mensual_decimal * plazo_prestamo ;
        double total_base_pagar = monto_prestamo + interes_total_simple ;
        double cuota_base_mensual = total_base_pagar / plazo_prestamo;
        double seguro_x_cuota = cuota_base_mensual * seguro_mensual_decimal;
        double valor_total_cuota_mensual = cuota_base_mensual + comision_fija_x_cuota + seguro_x_cuota;
        double total_final_pagar = valor_total_cuota_mensual * plazo_prestamo;
        
        System.out.println("*** CUOTAS MENSUALES ***");
        System.out.printf("Cuota de Pago Mensual: HNL %.2f%n", valor_total_cuota_mensual);
        System.out.printf("Total a Pagar: HNL %.2f%n", total_final_pagar);
        
        
        
        
        
        
        
        

        
        
        
    }
    
    
}
