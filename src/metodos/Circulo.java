package metodos;

/**
 * Programa que implementa una clase con diferentes métodos para crear un círculo
 * @author sergio.montalban@campusfp.es
 * @version 1.1
 */
public class Circulo {
    //**********ATRIBUTOS************
    private double centrox; //Centro en coordenada x
    private double centroy; //Centro en coordenada y
    private double radio;   //Radio del circulo
    
    //*********CONSTRUCTORES*********
    /**
     * Constructor que se utiliza cuando no se ha dado ningún valor a los atributos desde la clase Main
     */
    public Circulo () {
        
    }    
    /**
     * Constructor que recibe los parámetros de la clase Main
     * @param x Valor que se le ha asignado al centro en la coordenada x desde la clase Main
     * @param y Valor que se le ha asignado al centro en la coordenada y desde la clase Main
     * @param r Valor que se le ha asignado al  radio desde la clase Main
     */
    public Circulo (double x, double y, double r) {
        centrox = x;
        centroy = y;
        radio = r;
    }
    
    //***********METODOS************
    
    //GETTER Y SETTER
    /**
     * Método para delimitar el valor del centro del círculo en x
     * @param x Variable que contiene el valor del centro del círculo en x
     */
    public void setCentrox (double x) {
        this.centrox = x;
    }    
    /**
     * Método para retornar el valor del centro del círculo en x
     * @return centrox Retorna el valor del centro del círculo en x
     */
    public double getCentrox () {
        return centrox;
    }    
    /**
     * Método para delimitar el valor del centro del círculo en y
     * @param y Variable que contiene el valor del centro del círculo en y
     */
    public void setCentroy (double y) {
        this.centroy = y;
    }    
    /**
     * Método para retornar el valor del centro del círculo en y
     * @return centroy Retorna el valor del centro del círculo en y
     */
    public double getCentroy () {
        return centroy;
    }
    /**
     * Método para delimitar el valor delradio del círculo
     * @param r Variable que contiene el valor del radio del círculo
     */
    public void setRadio (double r) {
        this.radio = r;
    }
    /**
     * Método para retornar el valor delradio del círculo
     * @return radio Retorna el valor del radio
     */
    public double getRadio () {
        return radio;
    }
    
    //OTROS METODOS
    /**
     * Método para pasar a String todos los atributos
     * @return Retorna los valores del centro del círculo en x e y y el radio de este
     */
    @Override
    public String toString() {
        return "Circulo{" + "centrox=" + centrox + ", centroy=" + centroy + ", radio=" + radio + '}';
    }
    
    /**
     * Método para calcular el perímetro del círculo
     * @return perimetro Variable que tiene el valor del perímetro del círculo
     */
    public double perimetroCirculo () {
        double perimetro = Math.PI*2*radio;
        return perimetro;
    }
    
    /**
     * Método para calcular el área del círculo
     * @return area Variable que tiene el valor del área del círculo
     */
    public double areCirculo () {
        double area = Math.PI*(radio*radio);
        return area;
    }
    
    /**
     * Método para cambiar los valores de x e y del círculo y moverlo
     * @param deltax Valor que le damos al nuevo centro del círculo en x
     * @param deltay Valor que le damos al nuevo centro del círculo en y
     */
    public void moverCirculo (double deltax, double deltay) {
        centrox = deltax;
        centroy = deltay;
    }
    
    /**
     * Método para calcular la escala a la que se va a dibujar el círculo
     * @param s Un double que representa la escala a la que se va a representar el círculo
     */
    public void escalaCirculo (double s) {
        radio = radio/s;
    }
}
