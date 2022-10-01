
    public class Tour extends PieceEchec {
        public Tour(Position position, Boolean estBlanc) {
            super(position, estBlanc);
        }

        // @Override
        public boolean estDeplacementValide(Position nouvelle) {
            return position.getLigne() == nouvelle.getLigne()
                    ^
                    position.getColonne() == nouvelle.getColonne();
        }
    }
