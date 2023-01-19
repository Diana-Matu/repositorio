package Figuras;
import java.util.Scanner;
/**
 * Archivo con figuras
 */

 public class Figuras{
    public static void trianguloL () {
        Scanner num = new Scanner(System.in);
        System.out.println("De que tamaño quieres que sea la base del primer triangulo");
        int n = num.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void triangulov () {
        Scanner num = new Scanner(System.in);
        System.out.println("De que tamaño quieres que sea la base del segundo triangulo");
        int n = num.nextInt();

        for (int i=0; i <n; i++){
            for (int j=n; j > i; j--) {
                System.out.print("+");
            }
            System.out.println("");
        }
    }

    public static void triangulo () {
        Scanner num = new Scanner(System.in);
        System.out.println("De que tamaño quieres que sea la base del tercer triangulo");
        int n = num.nextInt();
        
        for (int i=0; i<n; i++){
            for (int j=n; j>i; j--){
                System.out.print(" ");
            }
            for (int k=0; k<i+1; k++){
                System.out.print("+");
            }
            System.out.println("");
        }

    }

    public static void rectangulo () {
        Scanner num = new Scanner(System.in);
        System.out.println("De que tamaño quieres que sea la base del rectangulo");
        int n = num.nextInt();
        System.out.println("De que tamaño quieres que sea la altura del rectangulo");
        int x = num.nextInt();
        for (int i=0; i < x; i++) {
            for (int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void perimetro () {
        Scanner num = new Scanner(System.in);
        System.out.println("De que tamaño quieres que sea la base del perimetro");
        int n = num.nextInt();
        System.out.println("De que tamaño quieres que sea la altura del perimetro");
        int x = num.nextInt();
        for (int i=0; i < x; i++) {
            for (int j=0; j<n; j++){
                if(i==0 || i==x-1)
                System.out.print("*");

                else if (j==0 || j==n-1)
                System.out.print("*");
                else System.out.print(" ");

            }
            System.out.println("");
        }
    }    

    public static void main (String args []){
        
        trianguloL();
        triangulov();
        triangulo();
        rectangulo();
        perimetro();



    }

 }