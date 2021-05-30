import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class Dado {
	private Random r = new Random();
    private int dice, roll = 0;
    Path filepath = null;
	String diceAscii = "";

    public Dado() {
    	this.dice = 6;
    }
    
    public Dado(int n) {
    	this.dice = n;
    }

    
    public int getLado() {
    	
    	if(roll == 0) {
    		System.err.println("O dado não foi rolado!");
    		return 0;
    	}
    	
    	return this.roll;
    	
    }

	public int rolar() {
		//inicializar seed
		int roll = r.getIntRand(dice) + 1;
        return this.roll;
    }

	
	
	public String toString() {
		diceAscii = "";
		int count;
	
		switch (this.roll) {
			case 1:
				try {
					filepath = Path.of("ascii/dice1.txt");
				} catch (InvalidPathException e) {
					System.err.println("Path Error " + e);
				}
				break;
				
			case 2:
				try {
					filepath = Path.of("ascii/dice2.txt");
				} catch (InvalidPathException e) {
					System.err.println("Path Error " + e);
				}
				break;	
			
			case 3:
				try {
					filepath = Path.of("ascii/dice3.txt");
				} catch (InvalidPathException e) {
					System.err.println("Path Error " + e);
				}
				break;	
			
			case 4:
				try {
					filepath = Path.of("ascii/dice4.txt");
				} catch (InvalidPathException e) {
					System.err.println("Path Error " + e);
				}
				break;	
			
			case 5:
				try {
					filepath = Path.of("ascii/dice5.txt");
				} catch (InvalidPathException e) {
					System.err.println("Path Error " + e);
				}
				break;
				
			case 6:
				try {
					filepath = Path.of("ascii/dice6.txt");
				} catch (InvalidPathException e) {
					System.err.println("Path Error " + e);
				}
				break;
			
			default:
				diceAscii = "Ainda não houveram rolagens";
		}
			try ( SeekableByteChannel fChan = Files.newByteChannel(filepath)) 
			{
				ByteBuffer mBuf = ByteBuffer.allocate(200);
				
				do {
					count = fChan.read(mBuf);
					
					if (count != -1)  mBuf.rewind();
					
					for(int i=0; i < count; i++)
						dice += (char) mBuf.get();
					
				} while (count != -1);
			} catch (IOException e) {
				e.printStackTrace();
			}	
		
		return diceAscii;
	}	
}
