
public abstract class PieceEchec {
        protected Position position;
        private Boolean estBlanc;

        public PieceEchec(Position position, Boolean estBlanc) {
                this.position = position;
                this.estBlanc = estBlanc;
        }

        public void deplacer( Position nouvelle ) {
                if( this.estDeplacementValide( nouvelle ) ) {
                        position = nouvelle;
                } else {
                        throw new DeplacementInvalideException();
                }
        }

        /**
         *
         * @param nouvelle
         * @return
         */
        public abstract boolean estDeplacementValide( Position nouvelle );
        public boolean estBlanc() {
                return estBlanc;
        }
}
