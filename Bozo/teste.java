import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;

public class teste {
	public static void main(String[] args) throws IOException {
		int count;
		Path filepath = null;
		String dice = "";
		
		for (int x = 1; x <= 6; x++ ) {
			dice = "";
			try {
				filepath = Path.of("ascii/dice" +x+ ".txt");
			} catch (InvalidPathException e) {
				System.out.println("Path Error " + e);
				return;
			}
			
			try ( SeekableByteChannel fChan = Files.newByteChannel(filepath)) 
			{
				ByteBuffer mBuf = ByteBuffer.allocate(200);
				
				do {
					count = fChan.read(mBuf);
					
					if (count != -1) 
						mBuf.rewind();
					
					for(int i=0; i < count; i++)
						dice += (char) mBuf.get();
					
				} while (count != -1);
					System.out.print(dice);
			}
			System.out.println();
		}
	}
} 

