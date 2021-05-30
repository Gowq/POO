public class RolaDados {
	private Dado[] stackDice;
	int qntDice = 0;
	
	public int getQntDice() {
		return qntDice;
	}

	public void setQntDice(int qntDice) {
		this.qntDice = qntDice;
	}

	public RolaDados(int n) {
		setQntDice(n);
		this.stackDice = new Dado[n];
		for(int i = 0; i < n; i++) {
			stackDice[i] = new Dado();
		}
	}
	
    public int[] rolar() {
    	int[] roll = new int[getQntDice()];
    	for(int i = 0; i < qntDice; i++) {
			roll[i] = stackDice[i].rolar();
		}
    	
    	return roll;
    }
    
    public int[] rolar(boolean[] quais) {
    	int[] roll = new int[getQntDice()];
    	for(int i = 0; i < qntDice; i++) {
    		
    		if(quais[i])
    			roll[i] = stackDice[i].rolar();
    		
    		roll[i] = this.stackDice[i].getLado();
		}
    	return roll;
    	
    }

    public int[] rolar(String s) {
    	int[] roll = new int[getQntDice()];
    	
    	if (s == null) 
    		for (int i = 0; i < getQntDice(); i++) 
    			roll[i] =  stackDice[getQntDice()-1].getLado();
    		
    	String[] numStr = s.split(" ");
    	int[] num = new int[numStr.length];
    	
    	for(int i = 0; i < numStr.length; i++) 
			num[i] = Integer.valueOf(numStr[i]);
		
    	for (int i = 0; i < qntDice; i++) {
			for(int j = 0; j < num.length; j++) 
				if(num[j] == i+1) { 
					this.stackDice[i].rolar();
					break;
				}
    	}
    	return roll;
    }

    public String toString() {
    	String ascii = "", asciiAux = "";
		String[] asciiAux2;
		
		for(int i = 0; i < qntDice; i++) {
			ascii += i+1 + "\t\t";
			asciiAux += this.stackDice[i].toString();
		}
		
		ascii += "\n";
		asciiAux2 = asciiAux.split("\n");
		asciiAux = "";
		
		for(int i = 0; i < qntDice; i++) {
			for(int j = i; j < (qntDice*5); j+=5) {
				asciiAux += asciiAux2[j];
				asciiAux += "\t\t";
			}
			asciiAux += "\n";
		}
		
		
		return ascii + asciiAux;
    	 
    }


}
