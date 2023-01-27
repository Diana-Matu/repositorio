import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

import java.util.Arrays;
/**
 * Arreglo de tamaño 10 que dice que numeros son negativos, cuantos positivos y cuantos 0
 */

 public class Num{
    /**
     * funcion que pide al usuario 10 numeros y los ingresa a un arreglo
     * @return el arreglo 
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
     * funcion que calcula la cantidad de numeros positivos que hay en el arreglo dado
     * @param arreglo
     * @return cantidad de numeros positivos
     */
    public static int positivos (int arreglo[]){
        int positivo = 0;
        for(int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]>0) 
                positivo ++;
        }
        return positivo;
    }
        /**
     * funcion que calcula la cantidad de numeros negativos que hay en el arreglo dado
     * @param arreglo
     * @return cantidad de numeros negativos
     */
    public static int negativos (int arreglo[]){
        int negativo = 0;
        for(int i = 0; i<arreglo.length; i++){
            if(arreglo[i]<0) 
            negativo++;
        }
        return negativo;
    }
        /**
     * funcion que calcula la cantidad de ceros que hay en el arreglo dado
     * @param arreglo
     * @return cantidad de ceros
     */
    public static int cero (int arreglo[]){
        int cero = 0;
        for(int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==0) {
                cero ++;
            }
        }
        return cero;
    }
    public static void main (String args[]){
        int numeros[] = arreglo();
        System.out.println(Arrays.toString(numeros));
        System.out.println("La cantidad de numeros positivos es: " + positivos(numeros));
        System.out.println("La cantidad de numeros negativos es: " + negativos(numeros));
        System.out.println("La cantidad de ceros es: " + cero(numeros));
    }
 }