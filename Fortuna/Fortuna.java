package Fortuna;
import java.util.Random;
import java.util.Scanner;
/**
 * Juego de la fortuna
 */
public class Fortuna{
    public static void main (String args []){
        Scanner datos = new Scanner(System.in);
        Random saludo = new Random();
        boolean salir = false;

        System.out.println("¿Quieres ver tu destino?");
        System.out.println("1.SI     2.NO");
        int usuario = datos.nextInt();
        if (usuario==2) salir = true;
        else {
            System.out.println ("¿Cual es tu nombre?");
            String nombre = datos.next();
            System.out.println ("Ingresa tu fecha de nacimiento");
            String nacimiento = datos.next();

            while (salir==false) {
                       
                int opcion = saludo.nextInt(3);
                String saludos [] = {"Hola ", "Holiwis ", "Buen dia ","Saludos "};
                System.out.println (saludos[opcion]+nombre+ " ¿Sobre que quieres averiguar?");
                System.out.println ("1.AMOR    2. DINERO     3.SALUD     4.VIDA PROFESIONAL");
                int eleccion = datos.nextInt();
            
                if(eleccion==1) {
                    int op1 = saludo.nextInt(4);
                    String [] amor = new String[4];
                    amor [0] = "Si estas en una relación, es el momento de aclarar todas esas cosas que te estan preocupando en este momento";
                    amor [1] = "Pronto te caeran unos besotes con tu crush, pareja, ligue... seras muy feliz";
                    amor [2] = "Alejate de esa o esas relaciones que te hacen mal. Si buscabas una señal, es esta.";
                    amor [3] = "Es el momento para que declares tu amor o hagas algo especial por esa persona en la que estas pensando.";
                    System.out.println(amor[op1]);
                }
                 if (eleccion==2) {
                    int op2 = saludo.nextInt(4);
                    String [] dinero = new String[4];
                    dinero [0] = "Es hora de jugar a la loteria, ya sabes que numeros utilizar";
                    dinero [1] = "No prestes tu dinero, ni lo metas a inversion, sera riesgoso en el proximo mes.";
                    dinero [2] = "Encontraras dinero pronto en tu bolsillo, tu camino o tu lavadora. Revisa bien, un dinero extra no te caera mal";
                    dinero [3] = "Ten cuidado en quien confias, podrias terminar estafado";
                    System.out.println(dinero[op2]);
                }
                if (eleccion==3) {
                    int op3 = saludo.nextInt(4);
                    String [] salud = new String[4];
                    salud [0] = "No te haria mal ir al medico, es mejor prevenir antes de que sea tarde";
                    salud [1] = "Esa persona por la que estas preocupado mejorara pronto, todo estara bien";
                    salud [2] = "Cuidate de problemas estomacales o de gripe o lo lamentaras";
                    salud [3] = " ";
                    System.out.println(salud[op3]);
                }
                if (eleccion==4) {
                    int op4 = saludo.nextInt(4);
                    String [] vida = new String[4];
                    vida [0] = "Tienes que concentrarte mas y poner más atención en las cosas de tu entorno que no te permiten avanzar, solo así tendras exito.";
                    vida [1] = "Una promoción laboral o buenas notas te llegaran muy pronto. Tu esfuerzo ha valido la pena";
                    vida [2] = "Te espera una mala racha allá fuera. Tendras algunos conflictos con tus compañeros y la vida se te hara pesada pero podras solucionarlo";
                    vida [3] = "Es un buen momento para emprender ese proyecto en el que tanto has pensado";
                    System.out.println(vida[op4]);
                }

                System.out.println("¿Quieres seguir jugando?");
  
                System.out.println("1) SI   2)NO");
                int fin = datos.nextInt();

                if(fin == 2) salir = true;
            }
        }
    }
}