public class Parseur {
    private TokenManager tm;
    private char tc;


    public Parseur(TokenManager tm) {
        this.tm = tm;
        avancer(); // mettre initialement en tc le premier caractere
    }


    private void avancer() {
        tc=tm.suivant();

    }

    private void consommer(char attendu){
        if (tc==attendu){
            avancer();
        }else {
            throw new RuntimeException("Token attendu: "+attendu+", "+tc+"trouve");
        }
    }


    private void S(){
        if(tc=='b'){
            consommer('b');
            S();
            consommer('b');
        }else if (tc=='c'){
            consommer('c');
            A();
            consommer('c');
        } else
            throw new RuntimeException("Token invalide: "+tc);

    }

    private void A(){
        if(tc=='b'){
            consommer('b');
            A();
            A();
        } else if (tc=='c'){
            consommer('c');
            A();
            S();
            A();
            consommer('b');
        } else if (tc=='d'){
            consommer('d');
            consommer('c');
            consommer('b');
        }else
            throw new RuntimeException("Token invalide: "+tc);
    }


    public void parse() {
        S();
        if(tc != '#'){
            throw new RuntimeException("Token Invalide : "+tc);
        }

    }
}
