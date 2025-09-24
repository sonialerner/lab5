public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start) {

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message) {

        String decryptedMessage = "" ;

        for(int i = 0; i < message.length(); i++) {

            // locate index of outer char
            int index1 = rotors[2].indexOf(message.charAt(i)) ;

            // locate char at that same index on the middle rotor
            char middle = rotors[1].charAt(index1) ;

            // locate index of that char on outer rotor
            int index2 = rotors[2].indexOf(middle) ;

            // locate char at that index on inner rotor  
            char inner = rotors[0].charAt(index2) ;
            
            // add new char to decryptedMessage
            decryptedMessage = decryptedMessage + inner ;

            // rotate rotor:

            // initialize rotator to inner rotor
            int j = 0 ;

            // change rotor to be rotated if needed
            if(i <= 27)
                j = 1 ;          
            else if(i <= 54)
                j = 2 ;

            rotors[j].rotate() ; 
        }

        return decryptedMessage ;
    }


    
    public String encrypt(String message){
        //TODO
        // locate index of letter on inner rotor

        // locate char of same index on outer rotor

        // locate index of that char on middle rotor

        // locate char of that index on outer rotor
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
