package poligono;

/**
 *
 * @author rafael
 */

public class Retangulo extends Poligono {

    private float base;
    private float altura;
    
    /**
     * @param b = base value
     * @param a = height value
     */
    public Retangulo(float b, float a)
    {
        super(4);
        this.base = b;
        this.altura = a;
    }
    
    @Override
    public float calcularArea()
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
        System.out.println("Área: " + this.calcularArea() + "\n");
    }
    
    public float getBase()
    {
        return base;
    }

    public void setBase(float base)
    {
        this.base = base;
    }

    public float getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }
    
}
