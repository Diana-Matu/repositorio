
/**
 * Suma
 */

 package operaciones;
public class Suma {
    private int x;
    private double y;
    /*
     * Metodo constructor
     * @param x entero
     * @param y double
     */
    public Suma (int x, double y) {
        this.x = x;
        this.y = y;
    }
    /*
     * funcion que realiza la operacion
     */
    public double operacionSuma (){
        x=1;
        y=3.5;
        double z=(double)x+y;
        return z;
    }
}