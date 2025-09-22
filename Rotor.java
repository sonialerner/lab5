public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
               
        return false ;
    }
    

    public int indexOf(char c){
        //TODO

        return 0 ;
    }

    public char charAt(int idx){
        //TODO

        return 'a' ;
    }
}
    
