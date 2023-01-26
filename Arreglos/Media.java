package Arreglos;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Arreglo de tamaño 10 que pida al usuario numeros enteros y saque la media de los mismos
 * Dando por separado los numeros positivos de los negatuvos
 */
public class Media{
    public static void main (String args []){
        int negativo=0, positivo=0;
        int numPos = 0, numNeg = 0;
        double medNeg, medPos;
        int arreglo[];
        arreglo = new int [10];
        Scanner numeros = new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("Da un número entero");
            arreglo[i] = numeros.nextInt();
        }
        for(int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 0) {
                negativo += arreglo[i];
                numNeg ++;
            }
            else if (arreglo[i]>0) {
                positivo += arreglo[i];
                numPos ++;
            }
        }
        medNeg = (double)negativo/((double)numNeg);
        medPos = (double)positivo/((double)numPos);
        System.out.println(Arrays.toString(arreglo));
        System.out.println(medNeg);
        System.out.println(medPos);
    }
}