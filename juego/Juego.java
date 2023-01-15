import java.util.Scanner;
/**
 * Juego condicional usando estructuras de control iterativas y condicionales.
 */

 public class Juego {
    /*
     * funcion que da la opcion de iniciar el juego o no
     */
    public static int inicio () {
        System.out.println("Squishymus es mi perro, es pequeño y muy travieso. ¿Quieres ayudar a Squishymus en su proxima aventura?");
        Scanner sc = new Scanner(System.in);
        System.out.println("1 si, 2 no");
        int si = sc.nextInt();
        if (si==1) return 1; 
        else return 0;       
    }
    /*
     * funcion de la primera escena 
     * para ambas opciones, el juego continua
     */
    public static int escena1 (){ //Squishymus se escapa --caso 1
        System.out.println("Squishymus siempre tiene comida en casa, pero aun así le gusta escaparse de vez en cuando e ir por un bocadillo a la pollería.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuando desperte esta mañana no lo encontraba. ¿Dónde estaba? 1.En la polleria   2.En su casita");
        int si = sc.nextInt();
        if (si==1) return 2; 
        else return 5;  
    }
    /*
     * funcion de la escena 2
     * en ambas opciones el juego continua
     */
    public static int escena2 (){ //Squishymus que hace en la polleria ---opcion 1 de caso 1
        System.out.println("¿Qué hace Squishymus en la polleria?");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.La señora de la pollería se distrae y Squishymus roba un hueso.   2.Decide seguir a doña Mary que compro muchos huesitos");
        int si = sc.nextInt();
        if (si==1) return 3; 
        else return 6;  
    }
    /*
     * funcion de la escena 3
     * ambas opciones siguen con el juego
     */
    public static int escena3 (){ //Squishymus roba el hueso
        System.out.println("¿Qué pasa despues de robar el hueso? ");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Los perros lo persiguen   2.Corre lo más rápido que puede porque la señora lo descubrio");
        int si = sc.nextInt();
        if (si==1) return 4; 
        else return 7;  
    }
    /*
     * funcion de la escena 4
     * ambas opciones terminan con el juego
     */
    public static int escena4 (){ //Los perros lo persiguen
        System.out.println("Recordemos que Squishymus no es un perro muy grande, pero ¿que hara este valiente perro?");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Corre a casa y pierde el hueso.   2. Enfrenta a los perros y pierde");
        int si = sc.nextInt();
        if (si==1) return 0; 
        else return 0;  
    }
    /*
     * funcion de la escena 5
     * La primer opcion continua con el juego, la segunda lo termina
     */
    public static int escena5 (){ //Squishymus estaba en su casita ---opcion 2 de caso 1
        System.out.println("Lo cual me alegra mucho, pero ¿que hacemos ahora?");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. ¿Iniciamos un aventura?  2. ¿Tenemos un dia tranquilo como cualquier otro?");
        int si = sc.nextInt();
        if (si==1) return 2; 
        else return 0;  
    }
    /*
     * Funcion de la escena 6
     * La primer opcion continua, la segunda lo termina
     */
    public static int escena6 (){ //Squishymus sigue a doña Mary ---opcion 2 de caso 2
        System.out.println("La señora se da cuenta de esto, se enoja y...");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Squishymus huye con el hueso  2. Doña Mary le arrebata el hueso");
        int si = sc.nextInt();
        if (si==1) return 7; 
        else return 0;  
    }
    /*
     * funcion de la escena 7
     * La primera opcion termina, la segunda continua
     */
   public static int escena7 (){ //Squishymus roba el hueso --opcion 2, caso 3
       System.out.println("¿Que hace con el hueso ahora?");
       Scanner sc = new Scanner(System.in);
       System.out.println("1. Se lo come   2. Piensa en algo más divertido");
       int si = sc.nextInt();
       if (si==1) return 0;
       else return 8; 
   }
   /*
    * funcion de la escena 8
    *Ambas opciones continuan
    */
   public static int escena8 (){ //Squishymus piensa en algo más divertido --opcion 2, caso 7
    System.out.println("¿Decide enterrarlo?");
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Si   2. No");
    int si = sc.nextInt();
    if (si==1) return 9;
    else return 11; 
    }
    /*
     * Funcion de la escena 9
     * La primer opcion termina, la segunda continua 
     */
   public static int escena9 (){ //Squishymus decide enterrarlo --opcion 1, caso 8
       System.out.println("¿Dónde enterro el hueso?");
       Scanner sc = new Scanner(System.in);
       System.out.println("1. En mi jardin   2. En el parque");
       int si = sc.nextInt();
       if (si==1) return 0;
       else return 10; 
   }
   /*
    * Funcion de la escena 10
    *Ambas opciones terminan
    */
   public static int escena10 (){ //Squishymus se escapa --opcion 2, caso 9
       System.out.println("Ya en el parque...");
       Scanner sc = new Scanner(System.in);
       System.out.println("1. Un policia lo ve y lo regresa a casa   2. Mientras escarba descubre fosiles de dinosaurio y se vuelve famoso");
       int si = sc.nextInt();
       if (si==2) return 0;
       else return 0; 
   }
   /*
    * Funcion de la escena 11
    *Ambas opciones terminan 
    */
   public static int escena11 (){ //Squishymus no entierra el hueso --opcion 2, caso 8
    System.out.println("¿Por qué?");
    Scanner sc = new Scanner(System.in);
    System.out.println("1. Lo ha perdido   2. Esta jugando con él");
    int si = sc.nextInt();
    if (si==2) return 0;
    else return 0; 
    }

    public static void main (String args []){
        int x = inicio();
        while (x != 0){
            switch (x) {
                case 1: 
                    x = escena1(); 
                    break;
                case 2:
                    x= escena2();
                    break;
                case 3: 
                    x = escena3(); 
                    break;
                case 4:
                    x = escena4();
                    break;
                case 5:
                    x = escena5();
                    break;
                case 6:
                    x = escena6();
                    break;
                case 7:
                    x= escena7();
                    break;
                case 8: 
                    x = escena8(); 
                    break;
                case 9:
                    x = escena9();
                    break;
                case 10:
                    x = escena10();
                    break;
                case 11:
                    x = escena11();
                    break;
            }
    }
 }
}