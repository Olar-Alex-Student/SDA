package classes;

import classes.Abstractisations.IPatrat;

public class Patrat implements IPatrat {
    public float length;
    public float area;
    public String toString() {
        return "Aria este:" + getAria() + ".";
    }
    public float getAria() {
        this.area = this.length * this.length;
        return area;
    }
}
