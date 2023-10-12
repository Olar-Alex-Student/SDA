public class Inginer extends Persoana implements IAngajat {
    public double coeficientSlarial = 1.5;
    public double nrMaxOre = 250;
    public double nrOreLucrate;

    public Inginer(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = (double) nrOreLucrate;
    }

    @Override
    public double salariu() {
        if(nrOreLucrate >= nrMaxOre)
            return 0;
        else {
            return coeficientSlarial * nrOreLucrate * salariuOrarMinim;
        }
    }

    @Override
    public String toString() {
        return "Inginerul " + super.toString() + " a lucrat " + nrOreLucrate + " ore si are salar " + salariu();
    }
}
