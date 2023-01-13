import java.util.Scanner;

/**
 * Funcion recursiva potencia
 */
 public class Recursion3 {
    /**
     * función que da la potencia de los numeros a b
     * @param a numero que sera elevado 
     * @param b numero al que se eleva a
     * @return el resultado 
     */
    public static int potencia (int a, int b){
        if(b==0) return 1;
        else return a * potencia(a, b-1); 
    }
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Da el primer número");
        int a = sc.nextInt();
        System.out.println("Da el segundo número");
        int b = sc.nextInt();
        System.out.println(potencia(a, b));
    }
 }
