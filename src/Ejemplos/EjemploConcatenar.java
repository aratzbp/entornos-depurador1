package src.Ejemplos;

import java.util.Scanner;

public class EjemploConcatenar {

    public static void main(String[] args) {
        
        String para_imprimir = "";

        Scanner scanner = new Scanner(System.in);

        String a;

        while(!(a = scanner.nextLine()).equals(".")) {
            
            para_imprimir += a;
        }

        System.out.println(para_imprimir);

    }
    
}
