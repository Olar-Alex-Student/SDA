package usv.ro.magazin;

import usv.ro.cutii.ICutie;
import usv.ro.jucarii.Jucarie;

public class Pachet {
    private ICutie cutie;
    private Jucarie jucarie;
    private double lungPanglica;
    public static void main(String[] args) {
        System.out.println("\n===== Demo Pachet (1p) =====");
        Pachet p1 = new Pachet(new Minge(10), true, true);
        System.out.println(p1);
        System.out.println("Pret="+p1.pretPachet());
    }
    public Pachet(Jucarie jucarie, boolean cereCutie, boolean cerePanglica) {

    }
    public double pretPachet() {

    }
    @Override
    public String toString() {
        return "Pachet{}";
    }
}
