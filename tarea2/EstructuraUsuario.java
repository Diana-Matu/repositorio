
/**
 * suma de los numeros desde 1 hasta n. Permite que el usuario introduzca el numero n
 */

public class EstructuraUsuario {
    public static void main (String args []){
        int user = Integer.parseInt(args[0]);
        int suma = 0;
        for (int i=1; i<=user; i++){
        suma = suma + i;
        }
        System.out.print(suma);
    }
}