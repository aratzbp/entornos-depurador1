package src.Ejercicios;

import java.util.Scanner;

public class EjercicioMediaPares {



    //Recoge numeros positivos hasta que se escriba 0, devuelve la media de los números pares.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int contador = 0;
        int resultado;
        int average = 0;

        while(entrada!= 0) {
            
            if (entrada % 2 == 0) {
                average += entrada; //average = average + entrada
                contador++;
            }
            entrada = sc.nextInt();
        }
        resultado = average/contador;
        System.out.println("La media de los números pares es: " + resultado);
    }
}

