public class Main {
    public static void main(String[] args) {
        // Flota Init
        Flota flota1 = new Flota();

        // Nava Croaziera Init
        NavaCroaziera sv = new NavaCroaziera(1000, "Suceava", "RO");

        // Use utilizare()
        System.out.print(sv + "\nUtilizare:");
        sv.utilizare();

        System.out.println();

        // Add Nava Croaziera in Flota
        flota1.adaugaNava( sv);

        // Nava Croaziera Init
        flota1.adaugaNava(new NavaCroaziera(5000, "Victoria", "RO"));

        // sout Flota
        System.out.println(flota1);

        // Use utilizare() in Flota
        System.out.println("\nUtilizare:");
        flota1.utilizare();
    }
}