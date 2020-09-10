package poligono;

/**
 *
 * @author rafael
 */

public class Triangulo extends Poligono {

    private float base;
    private float altura;
    
    /**
     *
     * @param b = base value
     * @param a = height value
     */
    
    public Triangulo(float b, float a)
    {
        super(3);
        this.base = b;
        this.altura = a;
    }
    
    @Override
    public float calcularArea()
    {
        return ((base * altura) / 2);
    }
    
    @Override
    public void imprimir()
    {
        System.out.println("Forma: Triângulo.");
        super.imprimir();
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + this.calcularArea() + "\n");
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(float base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }
    
    
    
}
