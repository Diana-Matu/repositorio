import java.util.Scanner;

/**
 * Funcion potencia
 */
 public class Iteracion3 {
    /**
     * función que da la potencia de los numeros a b
     * @param a numero que sera elevado 
     * @param b numero al que se eleva a
     * @return el resultado 
     */

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Da el primer número");
        int a = sc.nextInt();
        System.out.println("Da el segundo número");
        int b = sc.nextInt();
        int potencia = 1;
        while (b!=0){
        potencia = a * potencia;
        b--;
        }
        System.out.println(potencia);
    }
 }
