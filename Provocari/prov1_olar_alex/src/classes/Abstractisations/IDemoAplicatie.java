package classes.Abstractisations;

import classes.Dreptunghi;
import classes.Gresie;
import classes.Patrat;

public interface IDemoAplicatie {
    void readForPatrat(Patrat patrat);
    void readForDreptunchi(Dreptunghi dreptunghi);
    void readForGresie(Gresie gresie);
}