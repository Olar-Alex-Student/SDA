/**
 *
 * @author PSG
 * @param <T> - tipul informatiei din elementele listei
 */

package listadiamant;
import java.util.Iterator;
public class ListaGenerica<T> implements Iterable<T> {
    private Element<T> primul=null, ultimul=null;
    private int size = 0;
    @Override
    public Iterator<T> iterator() {
        return new IteratorLst<>(primul);
    }
    public void insertInFata(T x){
        Element<T> primulInitial=primul;
        this.size++;
        primul=new Element(x, primulInitial);
        if(primulInitial == null) ultimul=primul;
    }
    public void insertLaUrma(T x) {
        Element<T> ultimulInitial=ultimul;
        this.size++;
        ultimul = new Element(x, null);
        if(ultimulInitial == null) primul = ultimul;
        else
            ultimulInitial.setUrm(ultimul);
    }
    public void eliminaToateElementele(){
        primul=ultimul=null;
        this.size = 0;
    }
    @Override
    public String toString(){
        StringBuilder rez=new StringBuilder("[");
        for(Iterator<T> it=new IteratorLst(primul); it.hasNext();) {
            T info = it.next();
            rez.append( info==null ? "null" : info.toString() );
            if(it.hasNext())
                rez.append(", ");
        }
        rez.append(']');
        return rez.toString();
    }

    public int size() {
        return this.size;
    }
}