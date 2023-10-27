package usv.ro.magazin;

public class RolaPanglica {
    private static double rolaPanglica = 10000;
    private double pretPerCm = 0.1;

    private double costUnitateLungime(double cm) {
        this.rolaPanglica = this.rolaPanglica - cm;
        return cm * pretPerCm;
    }
}
