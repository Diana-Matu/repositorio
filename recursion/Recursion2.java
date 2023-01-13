
/**
 * Funcion factorial
 */

 public class Recursion2 {
        /**
     * función que da el factorial de un numero
     * @param n numero del que se dara el factorial
     * @return el resultado 
     */
    public static int factorial (int n){
        if(n==1) return 1;
        else return n * factorial(n-1); 
    }
    public static void main (String args []){
        int n = Integer.parseInt(args[0]);

        System.out.println(factorial(n));
    }
 }

