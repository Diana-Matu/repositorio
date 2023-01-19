import java.util.Scanner;
/**
 * Clase con el metodo main para realizar una division
 */

 public class Main {
    public static void main (String args []){
        Scanner num = new Scanner(System.in);
        System.out.println("Da el numero a dividir");
        int x = num.nextInt();
        System.out.println("Da el numero divisor");
        int y = num.nextInt();

        float a = Division.division(x,y);
        System.out.println(a);

        float b = Division.division(x,y);
        System.out.println(b);
    }
 }


