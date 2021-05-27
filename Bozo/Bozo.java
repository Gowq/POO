import java.io.IOException;

public class Bozo {


    public static void main(String[] args) throws IOException {

        RolaDados rolaDados = new RolaDados();
        Placar placar = new Placar();
        Dado dados = new Dado();

        placar.Imprime();

        for(int i = 1; i <= 5; i++) {
            System.out.println("***** Rodada "+ i);
            System.out.println("Pressione ENTER para lançar os dados \n");

            try {
                String entrada = EntradaTeclado.leString(); 
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Digite os números dos dados que quiser TROCAR. Separados por espaços.");

            String inputDados = EntradaTeclado.leString();
            //int dado1 = inputDados.lastIndexOf(" ");
            //int dado2 = inputDados.
            //System.out.println(dado1);
            //System.out.println(dado2);

            imprime();

        }
        
        
        


    }

    public static void imprime() {
        System.out.println("");
        System.out.println("1          2          3          4          5      "); 
        System.out.println("+-----+    +-----+    +-----+    +-----+    +-----+"); 
        System.out.println("|*   *|    |     |    |*    |    |*    |    |*   *|"); 
        System.out.println("|  *  |    |  *  |    |     |    |  *  |    |     |"); 
        System.out.println("|*   *|    |     |    |    *|    |    *|    |*   *|"); 
        System.out.println("+-----+    +-----+    +-----+    +-----+    +-----+"); 
              
    
        }
}
