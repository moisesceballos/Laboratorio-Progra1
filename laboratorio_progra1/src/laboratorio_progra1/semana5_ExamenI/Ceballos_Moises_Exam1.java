/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_progra1.semana5.newpackage;

import java.util.Random;
import java.util.Scanner;

public class Ceballos_Moises_Exam1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Random rand = new Random();
        int opcion = -1;

        do {
            System.out.println("\n===MENU===");
            System.out.println("1.PIRAMIDE");
            System.out.println("2.CLAVE");
            System.out.println("3.JUEGO DE PIEDRA,PAPEL Y TIJERA");
            System.out.println("4.ADIVINAR");
            System.out.println("0.SALIR");

            System.out.print("Ingrese opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: //PIRAMIDE
                    int filaP = -1;
                    String num = "";
                    String salida = "";
                    int resultado = 0;

                    System.out.println("===PIRAMIDE===");
                    while (filaP <= 0) {
                        System.out.print("Cuantas filas desea que tenga la piramide: ");
                        filaP = sc.nextInt();
                    }

                    for (int contar = 1; contar <= filaP; contar++) {

                        if (contar % 2 == 1) {

                            num = String.valueOf(contar);

                            salida += num;
                            resultado += contar;

                        }

                        System.out.println(salida + " = " + resultado);
                    }

                    break;
                case 2: //CLAVE
                    char letra = ' ';
                    System.out.println("\n===CLAVE===");
                    System.out.print("Ingrese un texto: ");
                    String texto = sc.next();
                    String textoCifrado = "";
                    
                    
                    for (int index =0; index<texto.length(); index++){
                        
                        letra = texto.charAt(index);
                        
                        if (letra == 'a'){
                            letra = 'z';
                            textoCifrado+=letra;
                        }else if (letra == 'b'){
                            letra = 'y';
                            textoCifrado+=letra;
                        }else if (letra == 'c'){
                            letra = 'x';
                            textoCifrado+=letra;
                        }else if (letra == 'd'){
                            letra = 'w';
                            textoCifrado+=letra;
                        }else if (letra == 'e'){
                            letra = 'v';
                            textoCifrado+=letra;
                        }else if (letra == 'f'){
                            letra = 'u';
                            textoCifrado+=letra;
                        }else if (letra == 'g'){
                            letra ='t';
                            textoCifrado+=letra;
                        }else if (letra == 'h'){
                            letra='s';
                            textoCifrado+=letra;
                        }else if (letra == 'i'){
                            letra ='r';
                            textoCifrado+=letra;
                        }else if (letra=='j'){
                            letra = 'q';
                            textoCifrado+=letra;
                        }else if (letra =='k'){
                            letra = 'p';
                            textoCifrado+=letra;
                        }else if (letra =='l'){
                            letra = 'o';
                            textoCifrado+=letra;
                        }else if (letra == 'm'){
                            letra = 'n';
                            textoCifrado+=letra;
                        }else if (letra == 'n'){
                            letra = 'm';
                            textoCifrado+=letra;
                        }else if (letra == 'o'){
                            letra = 'l';
                            textoCifrado+=letra;
                        }else if (letra =='p'){
                            letra='k';
                            textoCifrado+=letra;
                        }else if (letra =='q'){
                            letra ='j';
                            textoCifrado+=letra;
                        }else if (letra == 'r'){
                            letra ='i';
                            textoCifrado+=letra;
                        }else if (letra== 's'){
                            letra = 'h';
                            textoCifrado+=letra;
                        }else if(letra =='t'){
                            letra = 'g';
                            textoCifrado+=letra;
                        }else if (letra == 'u'){
                            letra = 'f';
                            textoCifrado+=letra;
                        }else if (letra == 'v'){
                            letra = 'e';
                            textoCifrado+=letra;
                        }else if(letra == 'w'){
                            letra = 'd';
                            textoCifrado+=letra;
                        }else if (letra =='x'){
                            letra = 'c';
                            textoCifrado+=letra;
                        }else if (letra=='y'){
                            letra = 'b';
                            textoCifrado+=letra;
                        }else if (letra=='z'){
                            letra = 'a';
                            textoCifrado+=letra;
                        
                        }else if (letra == 'A'){
                            letra = 'Z';
                            textoCifrado+=letra;
                        }else if (letra == 'B'){
                            letra = 'Y';
                            textoCifrado+=letra;
                        }else if (letra == 'C'){
                            letra = 'X';
                            textoCifrado+=letra;
                        }else if (letra == 'D'){
                            letra = 'W';
                            textoCifrado+=letra;
                        }else if (letra == 'E'){
                            letra = 'V';
                            textoCifrado+=letra;
                        }else if (letra == 'F'){
                            letra = 'U';
                            textoCifrado+=letra;
                        }else if (letra == 'G'){
                            letra ='T';
                            textoCifrado+=letra;
                        }else if (letra == 'H'){
                            letra='S';
                            textoCifrado+=letra;
                        }else if (letra == 'I'){
                            letra ='R';
                            textoCifrado+=letra;
                        }else if (letra=='J'){
                            letra = 'Q';
                            textoCifrado+=letra;
                        }else if (letra =='K'){
                            letra = 'P';
                            textoCifrado+=letra;
                        }else if (letra =='L'){
                            letra = 'O';
                            textoCifrado+=letra;
                        }else if (letra == 'M'){
                            letra = 'N';
                            textoCifrado+=letra;
                        }else if (letra == 'N'){
                            letra = 'M';
                            textoCifrado+=letra;
                        }else if (letra == 'O'){
                            letra = 'L';
                            textoCifrado+=letra;
                        }else if (letra =='P'){
                            letra='K';
                            textoCifrado+=letra;
                        }else if (letra =='Q'){
                            letra ='J';
                            textoCifrado+=letra;
                        }else if (letra == 'R'){
                            letra ='I';
                            textoCifrado+=letra;
                        }else if (letra== 'S'){
                            letra = 'H';
                            textoCifrado+=letra;
                        }else if(letra =='T'){
                            letra = 'G';
                            textoCifrado+=letra;
                        }else if (letra == 'U'){
                            letra = 'F';
                            textoCifrado+=letra;
                        }else if (letra == 'V'){
                            letra = 'E';
                            textoCifrado+=letra;
                        }else if(letra == 'W'){
                            letra = 'D';
                            textoCifrado+=letra;
                        }else if (letra =='X'){
                            letra = 'C';
                            textoCifrado+=letra;
                        }else if (letra=='Y'){
                            letra = 'B';
                            textoCifrado+=letra;
                        }else if (letra=='Z'){
                            letra = 'A';
                            textoCifrado+=letra;
                        }else{
                            textoCifrado+=letra;
                        }
                    }
                        
                        System.out.println("Texto Cifrado: " +  textoCifrado);
                            
                        

                    break;
                case 3: //PIEDRA PAPEL O TIJERA
                    int opcUsuario = 0;
                    int seleccionSiNo = 1;
                    boolean Jugando = true;
                    while (Jugando && seleccionSiNo == 1) {
                        System.out.println("\n=== PIEDRA, PAPEL O TIJERA ===");
                        System.out.println("1.PIEDRA");
                        System.out.println("2.PAPEL");
                        System.out.println("3.TIJERA");
                        System.out.print("Ingrese una opcion: ");

                        opcUsuario = sc.nextInt();

                        if (opcUsuario < 1 || opcUsuario > 3) {
                            System.out.println("Opcion invalida. Intente de nuevo.");
                            continue;
                        }

                        int opcPC = rand.nextInt(3) + 1;

                        System.out.print("\nOPCION USUARIO: ");
                        if (opcUsuario == 1) {
                            System.out.println("PIEDRA");
                        } else if (opcUsuario == 2) {
                            System.out.println("PAPEL");
                        } else {
                            System.out.println("TIJERA");
                        }

                        System.out.print("OPCION DEL COMPUTADOR: ");
                        if (opcPC == 1) {
                            System.out.println("PIEDRA");
                        } else if (opcPC == 2) {
                            System.out.println("PAPEL");
                        } else {
                            System.out.println("TIJERA");
                        }

                        // Resultado
                        if (opcUsuario == opcPC) {
                            System.out.println("EMPATE");
                        } else if ((opcUsuario == 1 && opcPC == 3)
                                || (opcUsuario == 2 && opcPC == 1)
                                || (opcUsuario == 3 && opcPC == 2)) {
                            System.out.println("GANASTE!");
                        } else {
                            System.out.println("GANA EL COMPUTADOR");
                        }

                        // Volver a jugar
                        System.out.println("\nVolver a jugar? 1. Si 2. No");
                        seleccionSiNo = sc.nextInt();
                        if (seleccionSiNo != 1) {
                            Jugando = false;
                            System.out.println("Gracias por jugar.");
                            break;
                        }
                    }
                    break;
                    

                case 4: //ADIVINAR
                    System.out.println("\n===ADIVINAR===");
                    int numeroG = rand.nextInt(101);
                    int numeroU = 0;
                    int intentos = 0;
                    while (intentos <= 10) {
                        System.out.print("\nIngrese un numero que este entre 0-100: ");
                        numeroU = sc.nextInt();

                        if (numeroU == numeroG) {
                            System.out.println("\nAdivinaste! el numero era: " + numeroG);
                            System.out.println("Adivinaste en el intento: " + intentos);
                            intentos += 1;
                            break;
                        } else {
                            if (numeroU > numeroG) {
                                System.out.println("\nFallaste!");
                                System.out.println("Numero Secreto es menor que el ingresado ");
                                System.out.println("INTENTO: " + (intentos + 1));
                                intentos += 1;
                            } else if (numeroU < numeroG) {
                                System.out.println("\nFallaste!");
                                System.out.println("Numero Secreto es mayor que el ingresado");
                                System.out.println("INTENTO: " + (intentos + 1));

                                intentos += 1;
                            }

                        }
                        if (intentos == 10) {
                            System.out.println("MENSAJE: YA NO TE QUEDAN INTENTOS");
                            break;
                        }
                    }
            }

        } while (opcion != 0);

    }

}
