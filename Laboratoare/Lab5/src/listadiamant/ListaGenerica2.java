/**
 *
 * @author OA
 * @param <T> - tipul informatiei din elementele listei
 */

package listadiamant;
import java.util.Iterator;
public class ListaGenerica2<T> implements Iterable<T> {
    private Element<T> primul=null, ultimul=null;
    @Override
    public Iterator<T> iterator() {
        return new IteratorLst<>(primul);
    }
    public T eliminaPrimul() {
        return null;
    }
}
