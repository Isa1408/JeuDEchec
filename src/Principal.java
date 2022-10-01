import java.util.*;

public class Principal {
    public static final int sommation( int n ) {
        int somme = 0;

        for( int i = 0; i <= n; ++ i ) {
            somme = somme + i;
            ++ i;
        }

        return somme;
    }

//    public static void main( String argv [] ) {
//        PieceEchec [][] echiquier = new PieceEchec[Position.NBR_COLONNE][Position.NBR_LIGNE];
//
//        echiquier[1][1] =
//                new Tour( new Position(2, 'b'), true);
//
//        PieceEchec p = new Pion( new Position( 3, 'd' ), true );
//        if( p.estBlanc() ) {
//
//        }
//
//        p = new Tour( new Position( 3, 'h' ), false);
//        // p :: static -> PieceEchec, dynamic -> Tour
//        p.deplacer( new Position( 4, 'b' ) );
//
//        echiquier[1][1].estDeplacementValide( new Position( 3, 'b' ) ) ;
//
//        // System.out.println( echiquier[0][0] );
//
//        Fraction f1 = new Fraction( 1,2 );
//        Fraction f2 = new Fraction( 1, 2 );
//
//        System.out.println( f1.equals( f2 ) );
//    }

    public static void main(String[] args) {
        int [] t;
        ArrayList<Integer> a = new ArrayList<>();

        a.add (4);
        a.add(6);
        a.add(-3);
        // arraylist: 4, 6 , -3

        // set(index, valeur)
        a.set(1,8); // 4, 8, -3

        a.add(1, 9); //4, 9, 8, -3
        a.remove(2); // 4 ,9 ,-3

        //je peux pas ajouter des elements en dehors des cases du tableau a 3 cases,
        // sauf pr celle qui suit juste apres mais je px pas avoir une case null entre des cases non vides

        System.out.println("[");
        for (int i = 0; i < a.size(); ++i) {
            if (0 != i){
                System.out.println(", ");
            }
            System.out.println(a.get(i));
        }
        System.out.println("]");

        //ArrayList<Integer> b = new ArrayList<>();
        List<Integer> b = new Vector<>();
        //Vector<Integer> b = new List<>(); //marche pas pcq Vector est plus petit que List

        b.add(6);
        b.addAll(a);

        System.out.println(b);

        Deque<Character> pile = new ArrayDeque<>();

        if (pile.isEmpty()){
            System.out.println("la pile est vide");
        }

        pile.push('j'); // j n est pas le sommet, il est en dessous de la pile
        pile.push('f'); // f est le sommet
        System.out.println(pile);
        System.out.println(pile.peek());
        Character c = pile.pop(); //le dernier charac ds la pile a ete enlevee et mnt on l a mit ds une variable
        System.out.println(pile);
        System.out.println("c = " + c);
        c = pile.pop();
        System.out.println("c = " + c);
        c = pile.pop(); // va creer un exception pcq il rest plus rien ds la liste

        Deque<Object> po = new ArrayDeque<>();
        po.push(4);
        po.push('r');
        po.push(new Tour( new Position(3,'g'), true));

        Object obj = po.pop();

        if(obj instanceof Tour l){
            l.estDeplacementValide(new Position(2, 'a'));
        }
    }

}

