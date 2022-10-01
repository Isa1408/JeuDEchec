public class Pion extends PieceEchec {
    public Pion(Position position, Boolean estBlanc) {
        super(position, estBlanc);
    }

    @Override
    public boolean estDeplacementValide(Position nouvelle) {
        return false;
    }
}
