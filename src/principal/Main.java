package principal;

import metodos.Circulo;

/**
 * Programa principal (punto de entrada del proyecto) que usa los métodos auxiliares para salto de la clase Circulo
 * @author sergio.montalban@campusfp.es
 * @version 1.1
 */
public class Main {

    /**Punto de entrada único al proyecto
     * <ul>
     *  <li>Utiliza métodos getter
     *  <li>Utiliza métodos setter
     *  <li>Utiliza métodos toString
     *  <li>Utiliza métodos perimetroCirculo
     *  <li>Utiliza métodos areCirculo
     *  <li>Utiliza métodos moverCirculo
     *  <li>Utiliza métodos escalaCirculo
     * </ul>
     * @param args Array de tipo String
     */
    public static void main(String[] args) {
        //Ponemos los valores de x, y, radio entre los parentesis para utilizar el constructor vacío, sino debemos dejarlos vacíos y nos los pondrá como null.
        Circulo circ = new Circulo(10,10,4);
        //Para ver los valores de todos pintaremos los valores mediante System.out.println()
        System.out.println(circ.getCentrox());
        System.out.println(circ.getCentroy());
        System.out.println(circ.perimetroCirculo());
        System.out.println(circ.areCirculo());
        
        System.out.println();
        System.out.println("Movemos el círculo de posición");        
        //Para mover el círculo y cambiar sus valores de x e y usamos el método moverCirculo y vemos que se cambian los valores
        circ.moverCirculo(20,20);
        System.out.println(circ.getCentrox());
        System.out.println(circ.getCentroy());
    }
    
}
