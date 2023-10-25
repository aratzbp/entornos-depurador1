package src.Ejemplos;

import java.util.Scanner;

public class EjemploFactorizar {
    
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int entrada = scanner.nextInt();
        int divisor=2;
        //Factorizar
        while(divisor <= entrada)
        {
            if(entrada % divisor == 0)
            {
                System.out.println(divisor);
                entrada = entrada / divisor;
            }
            else
            {
                divisor++;
            }
        }

        
    }
}
