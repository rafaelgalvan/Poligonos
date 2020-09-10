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
        this.setQtd_lados(qtd_lados);
    }
    
    public void imprimir()
    {
        System.out.println("Quantidade de lados: " + this.qtd_lados);
    }
    
    public abstract float calcularArea();
    
    public int getQtd_lados()
    {
        return qtd_lados;
    }

    public final void setQtd_lados(int qtd_lados)
    {
        if (qtd_lados < 3) {
            System.out.println("Quantidade de lados inválida.");
        } else {
            this.qtd_lados = qtd_lados;
        }
    }
}
