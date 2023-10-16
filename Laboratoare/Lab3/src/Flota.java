import java.util.Arrays;

public class Flota {
    public Nava[] nave;
    public int i = 0;

    public Flota() {
        this.nave = new Nava[2];
    }

    @Override
    public String toString() {
        return "Flota:\n" + Arrays.toString(nave);
    }

    public void utilizare() {
        for (Nava nava : nave) {
            nava.utilizare();
        }
    }

    public void adaugaNava(Nava n) {
        nave[i] = n;
        i++;
    }
}
