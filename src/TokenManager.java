public class TokenManager {
    private String entree;
    private int iCourant; // indice courant
    public TokenManager(String entree) {
        this.entree = entree;
    }

    char suivant(){
        if (iCourant < entree.length())
            return entree.charAt(iCourant++);
        return '#';
    }
}
