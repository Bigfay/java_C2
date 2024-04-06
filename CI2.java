import java.util.Iterator;
public class CI2 {

    public static void main(String [] args){
        IntegerCollection<Integer> ic = new IntegerCollection<>();
        ic.add(1);
        ic.add(3);
        ic.add(3);
        ic.add(5);
        ic.add(6);
        ic.add(10);
        System.out.println(ic);
        /**
         * ITERATION 1
         * Parcours de la collection dans l'ordre d'insertion
         */
        System.out.println("Itération 1");
        Iterator<Integer> it = ic.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        /**
         * TODO parcours classique
         */

        /**
         * ITERATION 2
         * Parcours de la collection dns l'ordre inverse d'insertion
         */

        /**
         * TODO parcours classique
         */
        System.out.println("Itération 2");
        Iterator<Integer> backIt = ic.backIterator();
        while(backIt.hasNext()){
            System.out.println(backIt.next());
        }

        /**
         * ITERATION 3
         * Parcours de la collection dans l'ordre d'insertion via une boucle for-each
         */
        System.out.println("Itération 3");


        /**
         * TODO for-each
         */
        for (Integer str: ic){
            System.out.println(str);
        }
    }
    }