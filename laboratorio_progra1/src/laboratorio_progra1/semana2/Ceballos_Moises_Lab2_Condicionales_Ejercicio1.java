
package laboratorio_progra1.semana2;

import java.util.Scanner;

public class Ceballos_Moises_Lab2_Condicionales_Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Ingrese fecha en el siguiente formato");
        System.out.println("dia,DD/MM");
        String fechaIngresada = sc.next();
        String diaTexto = fechaIngresada.substring(0, fechaIngresada.indexOf(",")).toLowerCase(); // da "dia" // guarda el substring
        String fechaSolo = fechaIngresada.substring(fechaIngresada.indexOf(",") + 1).trim();; // da "DD/MM" // giarda el substring
        
        
        
        if (diaTexto.equals("lunes") ){
            //nivel inicial     
        } else if(diaTexto.equals("martes")){
            //nivel intermedio
        } else if (diaTexto.equals("miercoles")){
            // nivel avanzado
        } else if (diaTexto.equals("jueves")){
            // practica hablada
        } else if (diaTexto.equals("viernes")){
            // ingles para viajeros
        } else{
            System.out.println("ERROR");
        }
        
        
        
        
        
        
    }
    
}
