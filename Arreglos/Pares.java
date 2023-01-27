import java.util.Scanner;
import java.util.Arrays;
/**
 * Programa que por medio de un arreglo de tamaño 10, 
 * calcula la media de unicamente los numeros en posiciones pares
 */

 public class Pares{
    /**
     * funcion que pide al usuario 10 numeros y los agrega a un arreglo
     * @return un arreglo de enteros
     */
    public static int[] arreglo() {
        int arreglo[];
        arreglo = new int [10];
        Scanner num = new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("Da un número entero");
            arreglo[i] = num.nextInt();
        }
        return arreglo;
    }
    /**
     *  funcion que saca la media de los numeros pares ingresados al arreglo
     * @return medPar, variable que contiene la media
     */
    public static int mediaPares(int array[]) {
        int pares =0, sumPar = 0, medPar=0;
        for(int i = 0; i < array.length; i++) {
            if (i%2==0) {
                pares += array[i];
                sumPar = pares++; 
                medPar = sumPar/5;
            }
        }
        return medPar;
    }
    public static void main (String args []){
        int numeros[] = arreglo();
        System.out.println(Arrays.toString(numeros));
        System.out.println("Media de posiciones pares " + mediaPares(numeros));
    }
 }