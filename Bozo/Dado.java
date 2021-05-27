public class Dado {
    
    Random r = new Random();
    

    public Dado() {
        int d = r.getIntRand(6);

    }
    
    public Dado(int n) {
        int d = r.getIntRand(n);
    }

    
    int getLado() {

    }

    int rolar() {
        double rand = r.getRand();
        
    }


    String toString() {
        

    }

}
