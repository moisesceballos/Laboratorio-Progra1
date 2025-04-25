
package laboratorio_progra1;


public class Ceballos_Moises_Lab1_Variables_Ejercicio3 {
    public static void main(String [] args){
        
        int clics1 = 60;
        double precio1 = 0.30;
        double subtotal1 = clics1 * precio1;
        
        int clics2 = 100;
        double precio2 = 0.25;
        double subtotal2 = clics2 * precio2;
        
        int clics3 = 20;
        double precio3 = 0.80;
        double subtotal3 = clics3 * precio3;
        
        int totalClics = clics1 +clics2 + clics3 ;
        double totalSinISV = subtotal1 + subtotal2 + subtotal3;
        double costoPromedio = totalSinISV / totalClics;
        double isv = totalSinISV * 0.16;
        double totalConISV = totalSinISV + isv;
        
        System.out.printf("Costo Promedio por Clic: $%.2f%n", costoPromedio);
        System.out.printf("Total con ISV: $%.2f%n", totalConISV);
        

        
        

        
    }
    
}
