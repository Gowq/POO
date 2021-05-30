import java.io.IOException;

public class Bozo {


    public static void main(String[] args) throws IOException {

        RolaDados rolaDados = new RolaDados(6);
        Placar placar = new Placar();
        final int matches = 0;
       


        for(int i = 1; i <= matches; i++) {
            System.out.println("***** Rodada "+ i);
            System.out.println("Pressione ENTER para lançar os dados \n");

            try {
                String entrada = EntradaTeclado.leString(); 
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Digite os dados que deseja TROCAR. Separados por espaços.");
			rolaDados.rolar(EntradaTeclado.leString());
			System.out.println(rolaDados.toString());
				
			System.out.println("Digite os dados que deseja TROCAR. Separados por espaços.");
			rolaDados.rolar(EntradaTeclado.leString());
			System.out.println(rolaDados.toString());
			
			System.out.println("Digite os dados que deseja TROCAR. Separados por espaços.");
			rolaDados.rolar(EntradaTeclado.leString());
			System.out.println(rolaDados.toString());
			
			System.out.println(placar.toString());

            String inputDados = EntradaTeclado.leString();
            //int dado1 = inputDados.lastIndexOf(" ");
            //int dado2 = inputDados.
            //System.out.println(dado1);
            //System.out.println(dado2);


        }
        
        System.out.println("********************");
		System.out.println("PONTUAÇÃO FINAL: " + placar.getScore());
		System.out.println("********************");
        
    }

}
