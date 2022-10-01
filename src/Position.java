public class Position {
    public static final int LIGNE_MIN = 1;
    public static final int LIGNE_MAX = 8;
    public static final int NBR_LIGNE = LIGNE_MAX - LIGNE_MIN + 1;

    public static final char COLONNE_MIN = 'a';
    public static final char COLONNE_MAX = 'h';
    public static final int NBR_COLONNE = COLONNE_MAX - COLONNE_MIN + 1;

    private int ligne;
    private char colonne;

    public Position(int noLigne, char noColonne) {
        if( noLigne < LIGNE_MIN || LIGNE_MAX < noLigne ) {
            throw new NoLigneInvalideException();
        }
        if( noColonne < COLONNE_MIN || COLONNE_MAX < noColonne ) {
            throw new NoColonneInvalideException();
        }

        this.ligne = noLigne;
        this.colonne = noColonne;
    }

    public int getLigne() {
        return ligne;
    }

    public void setLigne(int ligne) {
        this.ligne = ligne;
    }

    public char getColonne() {
        return colonne;
    }

    public void setColonne(char colonne) {
        this.colonne = colonne;
    }
}
