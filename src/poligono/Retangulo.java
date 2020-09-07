package poligono;

/**
 *
 * @author rafael
 */

public class Retangulo extends Poligono {

    private double base;
    private double altura;
    
    /**
     *
     * @param q = number of sides
     * @param b = base value
     * @param a = height value
     */
    public Retangulo(int q, double b, double a)
    {
        super(q);
        this.base = b;
        this.altura = a;
    }
    
    @Override
    public double calcularArea()
    {
        return (base * altura);
    }
    
    @Override
    public void imprimir()
    {
        System.out.println("Forma: Retângulo.");
        super.imprimir();
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + this.calcularArea());
    }
    
    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    
}
