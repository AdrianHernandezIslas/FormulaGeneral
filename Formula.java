
/**
 * Write a description of class Formula here.
 * 
 * @author (Adrian Hernandez Islas) 
 * @version (0.0.1)
 */
//Por convencion el nombre de una clase debe de comenzar con mayuscula
public class Formula
{
    //Area para declaracion de variables
   

    /**
     * Constructor de objetos de la clase Formula
     */
    public Formula()
    {
        
        
    }

    
    public double obtenerX1(double a,double b,double c){
        double discriminante = (b*b)-(4*a*c);
        double numerador = (-1 * b) + Math.sqrt(discriminante);
        double denominador = 2*a;
        return numerador/denominador;
    }
    
    public double obtenerX2(double a,double b,double c){
        double discriminante = (b*b)-(4*a*c);
        double numerador = (-1 * b) - Math.sqrt(discriminante);
        double denominador = 2*a;
        return numerador/denominador;
    }
}
