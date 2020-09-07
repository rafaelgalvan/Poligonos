package poligono;

/**
 *
 * @author rafael
 */

public class Main {
    
    public static void main(String[] args) {
        
        Retangulo re = new Retangulo(4, 5, 10);
        
        re.calcularArea();
        re.imprimir();
        
        Triangulo tri = new Triangulo(3, 5, 12);
        
        tri.calcularArea();
        tri.imprimir();
    }
}
