
public class Fraction {
    public static final Fraction ZERO = new Fraction( 0, 1 );
    public static final Fraction UN = new Fraction( 1, 1 );
    public static final int x = 10;

    private int numerateur;
    private int denominateur;

    {
        numerateur = 0;
        denominateur = 1;
    }

    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public void setNumerateur(int numerateur) {
        this.numerateur = numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public void setDenominateur(int denominateur) {
        this.denominateur = denominateur;
    }

    @Override
    public boolean equals( Object obj ) {
        boolean resultat = false;

        if( null != obj && obj instanceof Fraction temp ) {
//            Fraction temp = (Fraction)obj;
            resultat = numerateur * temp.denominateur == temp.numerateur * denominateur;
        }

        return resultat;
    }

    // surcharge
    public String toString( int i ) {
        return "";
    }

    // réécriture
    @Override
    public String toString() {
        return "Fraction{" +
                "numerateur=" + numerateur +
                ", denominateur=" + denominateur +
                '}';
    }
}
