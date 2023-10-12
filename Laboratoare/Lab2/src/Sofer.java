public class Sofer extends Persoana implements IAngajat{
    public double kmParcursi;
    public double nrOreLucrate;

    public Sofer(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = (double) nrOreLucrate;
    }

    public void setNrKmParcursi(int nrKmParcursi) {
        this.kmParcursi= (double) nrKmParcursi;
    }

    @Override
    public double salariu() {
        return (nrOreLucrate * salariuOrarMinim) + (kmParcursi * 0.1);
    }

    @Override
    public String toString() {
        return "Soferul " + super.toString() + " a lucrat " + nrOreLucrate + " ore si are salar " + salariu();
    }
}
