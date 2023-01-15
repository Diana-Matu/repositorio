import java.util.Scanner;
/**
 * Funcion factorial
 */

 public class Iteracion2 {

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Da el número del que se quiere saber su factorial");
        int numero = sc.nextInt();
        int factorial = 1;
        while(numero > 0){
          factorial = factorial*numero;
          numero--;
        }
        System.out.println(factorial);
    
    }
 }

