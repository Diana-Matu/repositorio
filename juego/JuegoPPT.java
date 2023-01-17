import java.util.Random;
import java.util.Scanner;
/**
 * Juego de piedra, papel o tijera
 */

 public class JuegoPPT {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        Random numero = new Random();
   
        boolean gameOver = false;

        String juego [] = {"Piedra", "Papel", "Tijera"};
      
        
        while(gameOver == false){
            System.out.println("Escoge piedra(1), papel(2) o tijera(3)");
            int usuario = sc.nextInt()-1;
            int opcion = numero.nextInt(3);
            System.out.println("Computadora: "+ juego[opcion]);
            System.out.println("Usuario: " + juego[usuario]);

            if (usuario==opcion) 
            System.out.println ("Empate");
            
            if (usuario==0 && opcion==1) 
            System.out.println ("Perdiste");
    
            if (usuario==1 && opcion==2) 
            System.out.println ("Perdiste");
            
            if (usuario==2 && opcion==0) 
            System.out.println ("Perdiste");
    
            if (usuario==0 && opcion==2) 
            System.out.println ("Ganaste");
    
            if (usuario==1 && opcion==0) 
            System.out.println ("Ganaste");
            
            if (usuario==2 && opcion==1) 
            System.out.println ("Ganaste");
            
            System.out.println("¿Quieres seguir jugando?");
  
            System.out.println("1) SI   2)NO");
            int cont = sc.nextInt();

            if(cont == 2) gameOver = true;
        
        }
    }
 }
