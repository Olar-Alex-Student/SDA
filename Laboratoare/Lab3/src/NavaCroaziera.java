public class NavaCroaziera extends Nava {
    private int nrPasageri;
    public NavaCroaziera(int nrPasageri, String name, String pavilion) {
        super(name, pavilion);
        this.nrPasageri = nrPasageri;
    }

    @Override
    public void utilizare() {
        System.out.println("Croaziere de lux");
    }

    @Override
    public String toString() {
        return "NavaCroaziera - " + super.toString() + ", nrPasageri=" + nrPasageri;
    }
}
