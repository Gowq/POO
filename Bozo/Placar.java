import java.util.Stack;

public class Placar {

	// Tabuleiro de 9 posições. Flag de vazio -1
	private int tab[] = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	int[] num;
	boolean pair, triplet, quadra, quina, seq = false;
	private char[] values;
	
    public boolean add(int pos, Stack<Integer> stackDice) {
    	
    	if(pos > 10 || pos < 1) {
			System.err.println("Digite uma posiÃ§Ã£o entre 1 a 10!");
			return false;
    	}
    	
    	if (tab[pos] != -1) {
    		System.err.println("Posição invalida");
    		return false;
    	}
    	
    	//Posicoes internas
    	if (pos > 6) {
	    		num = checkDices(stackDice);
	    	
	    
	    	for (int i = 0; i < 6; i++) {
	    		
	    		if (num[i] == 2) pair = true;
	    		
	    		if(num[i] == 3) triplet = true;

	    		if (num[i] == 4) quadra = true;
	    			 
	    		if (num[i] == 5) quina = true;  
	    	}
	    	
	    	for (int i = 0; i <= 5; i++) {
	    		if (tab[i] == 0)
	    			seq = false;
	    	}
	    	
	    	for (int i = 1; i <= 6; i++) {
	    		if (tab[i] == 0)
	    			seq = false;
	    	}
	    	
    	}
    		
    		
    	switch(pos) { 
    	
    	//fullhand
    	case 7:
    		if (pair && triplet) tab[6] = 15;
    		else tab[6] = 0;
    		break;
    	
    	//Straight 
    	case 8:
    		if (seq) tab[7] = 20;
    		else tab[7] = 0;
    		break;
    	
    	//quadra 
    	case 9:
    		if (quadra) tab[8] = 30;
    		else tab[8] = 0;
    		break;
    	
    	//quina
    	case 10:
    		if (quina) tab[9] = 40;
    		else tab[9] = 0;
    		break;
    		
    	}
    	
    		
    	while (!stackDice.empty()) {
    		int dice = stackDice.pop();
	    	if (dice == pos) tab[pos]++;
    	} 

    	return true;
    }

    public int getScore() {
    	int sum = 0;
    	
    	for(int i = 0; i < tab.length; i++)
    		if (tab[i] != -1)
    			sum += tab[i];
    	
    	return sum;
    }

    public String toString() {
    	
    	String tabAscii = "";
    	
		values = null;
		
		for (int i = 0; i< 10; i++) {
			
			
			if(tab[i] != -1) 
				values[i] = (char) tab[i];
			
			else 
				values[i] = '0';
			
		}
		tabAscii += values[0] + "\t|\t" + values[6] + "\t|\t" + values[3] + " \n";
		tabAscii += "-------------------------------------\n";
		tabAscii += values[1] + "\t|\t" + values[7] + "\t|\t" + values[4] + " \n";
		tabAscii += "-------------------------------------\n";
		tabAscii += values[2] + "\t|\t" + values[8] + "\t|\t" + values[5] + " \n";
		tabAscii += "-------------------------------------\n";
		tabAscii += "\t|\t" + values[9] + "\t|\t\n";
		tabAscii += "\t+---------------+\t\n";
		      
		return tabAscii;
    }	
    
    private int[] checkDices(Stack<Integer> stackDice) {
    	
		int[] num = {0, 0, 0, 0, 0, 0};
		
		
		switch(stackDice.pop()) {
		
			case 1: num[0]++; break;
					
			case 2: num[1]++; break;
					
			case 3: num[2]++; break;
					
			case 4: num[3]++; break;
					
			case 5: num[4]++; break;
					
			case 6: num[5]++; break;
		}
		
		
		return num;
	}
    
    
}
