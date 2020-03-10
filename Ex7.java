import java.io.IOException;

public class Ex7 {

    public static void main(String[] args) throws IOException {
        int ite = 0;
        double tol = Math.pow(10, -7);
        double raiz = 0, a, b;

        System.out.printf("Escreva o primeiro valor do intervalo: ");
        a = EntradaTeclado.leDouble();
        System.out.printf("Escreva o segundo valor do intervalo: ");
        b = EntradaTeclado.leDouble();

        do {
            ite++;
            raiz = (a + b) / 2;

            if (sig(funcao(raiz)) == sig(funcao(a)))
                a = raiz;
            else
                b = raiz;

        } while (((b - a) / 2) > tol || funcao(raiz) != 0);

        System.out.println("Resultado: " + raiz);
        System.out.println("O número de iterações: " + ite);
    }

    public static double funcao(double x) {
        x = Math.pow(x, 3) - Math.pow(x, 2) - 13 * x + 8;
        return x;
    }

    public static boolean sig(double x) {
        if (x < 0)
            return true;
        
        return false;
    }
    
}