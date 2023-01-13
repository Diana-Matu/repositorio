/**
 * Funcion recursiva que suma desde el numero 1
 */

public class Recursion1{
    /**
     * función que hace la suma recursiva.
     * @param n numero que se sumara
     * @return el resultado de la suma
     */
    public static int suma (int n) {
        if(n==1) return 1;
        else return n + suma(n-1); 
    }
    public static void main (String args []){
        int n = Integer.parseInt(args[0]);

        System.out.println(suma(n));
    }
    
}