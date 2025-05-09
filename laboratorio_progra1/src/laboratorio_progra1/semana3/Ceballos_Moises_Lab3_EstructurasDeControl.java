
package laboratorio_progra1.semana3;

import java.util.Scanner;
        
public class Ceballos_Moises_Lab3_EstructurasDeControl {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        sc.useDelimiter("\n");
        int opcion = 0;
        
        
        do{ //MENU
            System.out.println("\nMENU DE OPCIONES: ");
            System.out.println("1. Palabra Al Reves");
            System.out.println("2. Numero Perfecto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir:");
            
            System.out.print("\nIngrese una opcion del menu: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: //PALABRA AL REVES
                    System.out.println("***PALABRA AL REVES***");
                    
                    int cantPalabras = -1;
                    int longitudP = 0;
                    String palabra = "";
                    String reverso = "";
                    int longitudMaxima = 0 ;
                    String palabraMasLarga = "";
                    String palindromo = "";
                    
                    while (cantPalabras<0){
                        System.out.println("Ingrese una cantidad de palabras:");
                        cantPalabras = sc.nextInt();
                    }
                    System.out.println("\nINGRESE PALABRAS:");
                    
                    for (int i = 1;i<=cantPalabras;i++){
                        System.out.print("Palabra#" + i + " :");
                        palabra = sc.next();
                        reverso ="";
                        
                        if (palabra.length() > longitudMaxima) { 
                            longitudMaxima = palabra.length();
                            palabraMasLarga = palabra;
                        }
                        
                        for (int j = palabra.length()-1;j>=0;j--){ 
                            reverso+=palabra.charAt(j); 
                            
                            
                        }
                        
                        
                        
                        System.out.println("Reverso:" + reverso);
                        
                        if (!reverso.equals(palabra)){
                            palindromo= "no";
                        }else if (reverso.equals(palabra)){
                                palindromo="si";
                            }
                 
                    }
                    
                    System.out.println("\nPalabras mas larga: " + palabraMasLarga);
                    System.out.println("Palindromo: " + palindromo);
                               
                    break;
                    
                case 2: //NUMERO PERFECTO
                    
                    System.out.println("***NUMERO PERFECTO***");
                    int numero = -1;
                    
                    int sumadiv = 0;
                    
                  
                    while(numero<0){
                        
                    System.out.println("Ingrese un numero: ");
                    numero = sc.nextInt();
                    
                    }
                    
                    for (int i = 1;i<numero;i++){
                        if (numero % i == 0) { 
                            sumadiv += i; 
                        }
                    }

                    if (sumadiv == numero) {
                        System.out.println(numero + " es un numero perfecto.");
                    } else {
                         System.out.println(numero + " no es un numero perfecto.");
                    }
                  
                    break;
    
                case 3: //PRIMOS
                    
                 
                    System.out.println("***PRIMOS***");
                    
                    int min = 10;
                    int max = 100;
                    int numeroA = (int) (Math.random() * (max - min + 1)) + min;
                    
                    System.out.println("Numero generado: " + numeroA);
                    
                    int numDivisores = 0;
                    int divisor = 1;
                    
                     for (divisor = 1; divisor <= numeroA; divisor++) {
                        if (numeroA % divisor == 0) { 
                            numDivisores++; 
                        }
                     }
                     
                     if (numDivisores == 2) { 
                        System.out.println(numeroA + " es un numero primo.");
                     } else {
                         System.out.println(numeroA + " no es un numero primo.");
                     }

                    break;
             
                case 4: //VOTACIONES
                    int votantes = -1;
                    
                    
                    System.out.println("***VOTACIONES***");
                    while(votantes<=0){
                    System.out.println("Ingrese la cantidad de votantes en el pais");
                    votantes = sc.nextInt();
                    }
                    
                    int votoAzul = 0, votoRojo =0, votoNegro = 0, votoAmarillo=0;
                    int votos = 0;
                    int votos_validos = 0;
                    int votos_nulos = 0;
                  
                    
                    for (int i = 1;i<=votantes;i++){ 
                   
                        int partido = -1;
                
                        System.out.println("\n***Votante:" + i + " ***" );
                        
                        
                        while (partido<0){
                        System.out.println("\n+--------+----------+");
                        System.out.println("| CODIGO | PARTIDO  |");
                        System.out.println("+--------+----------+");
                        System.out.println("|    1   |  AZUL    |");
                        System.out.println("+--------+----------+");
                        System.out.println("|    2   |  ROJO    |");
                        System.out.println("+--------+----------+");
                        System.out.println("|    3   |  NEGRO   |");
                        System.out.println("+--------+----------+");
                        System.out.println("|    4   | AMARILLO |");
                        System.out.println("+--------+----------+");
                        
                        System.out.println("Ingrese el codigo del partido a votar: ");
                        partido = sc.nextInt();
                        
                        switch (partido){
                            
                            case 1:
                                System.out.println("\n+-----------+------+");
                                System.out.println("| VOTANTE " + i + " | AZUL |");
                                System.out.println("+-----------+------+");
              
                                votoAzul +=1;
                                votos_validos+=1;
                                votos+=1;
                                
                                break;
                            case 2: 
                                System.out.println("\n+-----------+------+");
                                System.out.println("| VOTANTE " + i + " | ROJO |");
                                System.out.println("+-----------+------+");
                                votoRojo +=1;
                                votos_validos+=1;
                                votos+=1;
                                
                                break;
                            case 3:
                                System.out.println("\n+-----------+-------+");
                                System.out.println("| VOTANTE " + i + " | NEGRO |");
                                System.out.println("+-----------+-------+");
                                votoNegro +=1;
                                votos_validos+=1;
                                votos+=1;
                                break;
                            case 4:
                                System.out.println("\n+-----------+-----------+");
                                System.out.println("| VOTANTE " + i + " | AMARILLO  |");
                                System.out.println("+-----------+-----------+");
                                votoAmarillo +=1;
                                votos_validos+=1;
                                votos+=1;
                                break;
                            default:
                                System.out.println("\nPartido Inexistente");
                                System.out.println("+-----------+------+");
                                System.out.println("| VOTANTE " + i + " | NULO |");
                                System.out.println("+-----------+------+");
                                
                                votos_nulos+=1;
                                votos+=1;
                                break;
                                    
                        }

                        }
         
                    }
                    
                  
                    if (votos_validos >= votos * 0.6){
                    System.out.println("\n*** RESULTADOS FINALES ***");
                    System.out.println("VOTOS TOTALES: " + votos + " votos");
                    System.out.println("VOTOS VALIDOS: " + votos_validos + " votos");
                    System.out.println("VOTOS NULOS: " + votos_nulos + " votos");
                    
                    System.out.println("\nPartido AZUL: " + votoAzul + " votos");
                    System.out.println("Partido ROJO: " + votoRojo + " votos");
                    System.out.println("Partido NEGRO: " + votoNegro + " votos");
                    System.out.println("Partido AMARILLO: " + votoAmarillo + " votos");
                    
                    if (votoAzul > votoRojo && votoAzul > votoNegro && votoAzul > votoAmarillo){
                        
                        System.out.println("\nPartido Ganador: Azul");
                    }else if (votoRojo > votoAzul && votoRojo > votoNegro && votoRojo > votoAmarillo){
                        System.out.println("\nPartido Ganador: Rojo");   
                    }else if (votoNegro > votoAzul && votoNegro > votoRojo && votoNegro > votoAmarillo){
                        System.out.println("\nPartido Ganador: Negro");
                    }else if (votoAmarillo > votoAzul && votoAmarillo > votoRojo && votoAmarillo > votoNegro){
                        System.out.println("\nPartido Ganador: Amarillo");
                    }
                                        
                    }else{
                        System.out.println("MNESAJE: VOTACION FALLIDA");
                    }
                    
 
                    break;
 
                case 5: //SALIR DEL SISTEMA
                    System.out.println("Saliendo del sistema...");
                    break;
              
                
            }
    
        }while(opcion!=5);
        
        
        
        
    }
    
}
