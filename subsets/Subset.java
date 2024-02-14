package subsets;

import recursion.revrec;

public class Subset {
    public static void main(String[] args) {
        subsseq(" ","abc");
    }

    static void subsseq( String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsseq(p + ch, up.substring(1));
        subsseq(p, up.substring(1));

        // either its gona take it or leave it (check notes)
    }
}
