public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c) {
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate() {

        // increment start char
        this.startChar = charAt(this.indexOf(startChar) + 1) ;
               
        return true ;
    }

    public int indexOf(char c) {

        for(int i = 0 ; i <= 27 ; i++) {
            if(rotorValues.charAt(i) == c) {
                return i ;
            }
        }

        return -1 ;
    }

    public char charAt(int idx) {
        return this.charAt(idx) ;
    }
}
    
