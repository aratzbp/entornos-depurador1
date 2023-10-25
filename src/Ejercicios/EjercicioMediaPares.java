package src.Ejercicios;

import java.util.Scanner;

public class EjercicioMediaPares {

    private static Scanner scanner;

    //Recoge numeros positivos hasta que se escriba 0, devuelve la media de los números pares.
    public static void main(String[] args) {


        scanner = new Scanner(System.in);

        int entrada = scanner.nextInt();

        int average = 0;

        while(entrada!= 0) {
            
            if (entrada % 2 == 1) {
                average += entrada; //average = average + entrada
            }
        }
        System.out.println("La media de los números pares es: " + average);
    }
}

