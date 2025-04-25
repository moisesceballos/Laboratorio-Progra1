
package laboratorio_progra1;
import java.util.Scanner;


public class Ceballos_Moises_Lab1_Variables_Ejercicio4 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        //Ejercicio A
        System.out.println("***EJERCICIO A***");
        System.out.println("Ingrese el numerador 1:");
        double a_numerador1 = sc.nextDouble();
        System.out.println("Ingrese el denominador 1:");
        double a_denominador1 = sc.nextDouble();
        System.out.println("Ingrese el numerador 2:");
        double a_numerador2 = sc.nextDouble();
        System.out.println("Ingrese el denominador 2:");
        double a_denominador2 = sc.nextDouble();
        double a_resultado = (a_numerador1 / a_denominador1) + (a_numerador2 / a_denominador2);
        System.out.printf("El resultado es: %.2f\n", a_resultado);
        
        //Ejercicio B
        System.out.println("***EJERCICIO B***");
        System.out.println("Ingrese el valor de x:");
        double variable_x = sc.nextDouble();
        System.out.println("Ingrese el valor de y:");
        double variable_y = sc.nextDouble();
        double resultado_b = (1 / (variable_x - 5)) - ((3 * variable_x * variable_y) / 4);
        System.out.printf("El resultado es: %.2f\n", resultado_b);

        
        
        
        
        
        
    }
    
}
