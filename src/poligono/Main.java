package poligono;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rafael
 */

public class Main {
    
    public static void main(String[] args) throws IOException
    {
        
        short opt;
        float a = 0, b = 0;
        
        do {
            System.out.print("Escolha uma das opções abaixo:\n"
                            + "[1] Retângulo\n"
                            + "[2] Triângulo\n"
                            + "[0] Sair\n\n");
            
            Scanner scan = new Scanner(System.in);
            
            opt = scan.nextShort();
            
            if (!(opt <= 0 || opt > 2)) {
                System.out.print("Agora informe o valor da BASE:\n");
                b = scan.nextFloat();
            
                System.out.print("Agora informe o valor da ALTURA:\n");
                a = scan.nextFloat();
            }
            
            switch (opt) {
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                case 1:
                    Retangulo ret = new Retangulo(b, a);
                    ret.imprimir();
                    ret.calcularArea();
                    Pause();
                    break;
                case 2:
                    Triangulo tri = new Triangulo(b, a);
                    tri.imprimir();
                    tri.calcularArea();
                    Pause();
                    break;
                default:
                    System.out.print("Opção inválida!\n");
                    Pause();
            }           
        } while (opt != 0);
    }
    
    public static void Pause() throws IOException
    {
        System.out.print("Pressione a tecla ENTER para continuar.\n");
        System.in.read();
    }
}
