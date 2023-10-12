public class CalculSalarii {
    public void main() {

        // Class Init
        Inginer i1 = new Inginer("Andries","Serban");
        Inginer i2 = new Inginer("Cocris","Iulian");
        Sofer s1 = new Sofer("Mandiuc","Marius");

        // Set Hours
        i1.setNrOreLucrate(100);
        i2.setNrOreLucrate(200);
        s1.setNrOreLucrate(250);

        // Set Km
        s1.setNrKmParcursi(1000);

        // Sout toStirng
        System.out.println(i1.toString());
        System.out.println(i2.toString());
        System.out.println(s1.toString());

        // Calculate wage
        double totalSalarii = i1.salariu() + i2.salariu() + s1.salariu();

        // Sout all wages
        System.out.println("Total salarii "+totalSalarii+" lei");

    }
}
