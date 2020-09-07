package poligono;

/**
 *
 * @author rafael
 */

public abstract class Poligono {

    private int qtd_lados;

    public Poligono()
    {
        this(0);
    }
    
    public Poligono(int qtd_lados)
    {
        this.qtd_lados = qtd_lados;
    }
    
    public void imprimir()
    {
        System.out.println("Quantidade de lados: " + this.qtd_lados);
    }
    
    public abstract double calcularArea();
    
    public int getQtd_lados()
    {
        return qtd_lados;
    }

    public void setQtd_lados(int qtd_lados)
    {
            this.qtd_lados = qtd_lados;
    }
}
