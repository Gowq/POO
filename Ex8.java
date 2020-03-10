import java.io.IOException;

public class Ex8 {

    public static void main(String[] args) throws IOException{


        int ite = 0;
        double tol = Math.pow(10, -7);
        double  a, raiz;

        System.out.printf("Escreva o chute inicial: ");
        a = EntradaTeclado.leDouble();

        do {
            raiz = a - ((funcao(a))/derivada(a));
            ite++;
            a = raiz;

        } while ((Math.abs(a-raiz)) > tol || (Math.abs( funcao(raiz))) > tol);

        

        System.out.println("Resultado: " + raiz);
        System.out.println("Iterações: " + ite);

    }

    public static double funcao(double x) {
        x = Math.pow(x, 3) - Math.pow(x, 2) - 13 * x + 8;
        return x;
    }

    public static double derivada(double x) {

        x = 3 * Math.pow(x,2) - 2 * x - 13;
        return x;    

    }

        

}