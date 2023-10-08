import classes.DemoAplicatie;
import classes.Dreptunghi;
import classes.Gresie;
import classes.Patrat;

public class Main {
    public static void main(String[] args) {

        //Classes Init
        DemoAplicatie demoAplicatie = new DemoAplicatie();
        Patrat patrat = new Patrat();
        Dreptunghi dreptunghi = new Dreptunghi();
        Gresie gresie = new Gresie();

        //Patrat
        demoAplicatie.readForPatrat(patrat);

        //Dreptunghi
        demoAplicatie.readForDreptunchi(dreptunghi);

        //Gresie
        demoAplicatie.readForGresie(gresie);
    }
}