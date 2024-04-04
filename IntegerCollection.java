import java.util.ArrayList;
import java.util.List;

/**
 * @Overview IntegerCollection représente une collection d'entier,  trié par ordre insertion.
 * Il est mutable
 * De manière générale, un IntSet est défini comme [x1, xi,...,xn]
 * avec 0 < i <= n et n = cardinalité de IntegerCollection
 * ex: {3,5,18,5,59,23}; 3 est le premier élément rentré dans IntegerCollection, 23 le plus récent
 */
public class IntegerCollection {

    private List<Integer> liste;

    /**
     * @effects crée une nouvelle IntegerCollection vide
     */
    public IntegerCollection() {
        liste = new ArrayList<>();
    }

    /**
     * @modifies this
     * @effects ajoute une occurence de i à this
     */
    public void add(int i){
        liste.add(i);
    }

    /**
     * @modifies this
     * @effects retire une (et une seule) occurence de i à this
     */
    public void remove(int i){
        liste.remove((Integer) i);
    }

    /**
     * @return l'index de i si i appartient à this;
     * @throws MissingIntegerException sinon
     */
    public int searchInt(Integer i) throws MissingIntegerException{
        if(liste.contains(i)) return liste.indexOf(i);
        else throw new MissingIntegerException("IntegerCollection.searchInt(Integer i)");
    }


    @Override
    public String toString() {
        return "Collection : " + liste.toString();
    }

    /**
     * @throws NullPointerException, toujours
     */
    private void exceptionGenerator() throws NullPointerException{
        throw new NullPointerException();
    }

    /**
     * @throws MonExceptionAMoiException, toujours
     */
    public void captureEtRelance() throws MonExceptionAMoiException{
        try {
            exceptionGenerator();
        }
        catch(NullPointerException e){
            throw new MonExceptionAMoiException("IntegerCollections.captureetRelance()");
        }
    }


    /**
     * TODO à enrichir
     */

}