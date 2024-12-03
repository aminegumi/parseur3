
public class Main {
    public static void main(String[] args) {
        String[] chars = {"cdcbc", "bcdcbcb", "cbdcbdcbc", "ccdcbcdcbcdcbbcr", "cdcbbb", "cdcb", ""};
        for(String ch : chars){
            System.out.println("Le mot "+ ch+" : \t");
            TokenManager tm = new TokenManager(ch);

            Parseur parseur = new Parseur (tm);

            try{
                parseur.parse();
                System.out.println(ch + " est validee ");
            }
            catch(RuntimeException exp){
                System.out.println(ch + " n'est pas valide");
                System.out.println(exp.getMessage());
            }

        }

        System.out.println("\n\n");
    }
}