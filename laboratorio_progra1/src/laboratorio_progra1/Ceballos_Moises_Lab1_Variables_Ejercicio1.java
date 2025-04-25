package laboratorio_progra1;

/* ----- Boleta del Empleado -------
Nombre del Empleado: " "
Hora de Trabajo Mensual: ##
Tarifa por Hora : Lps. ##.##
Salario del Empleado Semanal: Lps. ##.##
*/



import java.util.Scanner;


public class Ceballos_Moises_Lab1_Variables_Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Favor ingrese su Nombre y Apellido");  
        String nombreEmpleado = sc.next() ;
        System.out.println("su nombre es: " + nombreEmpleado);
        
        System.out.println("Favor ingrese sus Horas Trabajadas Diariamente ");
        double horasTrabajadas_Diarias = sc.nextDouble();
        System.out.println("Favor ingrese sus dias trabajados semanalmente");
        double diasTrabajados_Semanal = sc.nextDouble();
        System.out.println("Favor ingrese las semanas que trae el mes actual");
        double semanas_del_mes = sc.nextDouble();
        System.out.println("Favor ingrese su Tarifa por Hora");
        double tarifa_x_hora = sc.nextDouble();
        double horasTrabajadas_Semanal = horasTrabajadas_Diarias * diasTrabajados_Semanal;
        double horasTrabajadas_Mensual= horasTrabajadas_Semanal * semanas_del_mes;
        double salario_Semanal = horasTrabajadas_Semanal * tarifa_x_hora;
        double salario_Mensual = horasTrabajadas_Mensual * tarifa_x_hora;
        
        System.out.println("---Boleta de Empleado---");
        System.out.println("Nombre del Empleado: " + nombreEmpleado);
        System.out.println("Horas de Trabajo Mensual: " + horasTrabajadas_Mensual );
        System.out.println("Tarifa por Hora: " + tarifa_x_hora + " Lps.");
        System.out.println("Salario del Emmpleado Semanal es: " + salario_Semanal + " Lps.");
     
        
        
        
        
        
      
      
         
        
        
        
        
        
        

        
        
    }
    
}
