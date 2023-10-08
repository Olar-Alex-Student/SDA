package classes;

import classes.Abstractisations.IDreptunghi;

public class Dreptunghi implements IDreptunghi {
    public float length;
    public float width;
    public float area;
    public String toString() {
        return "Aria este:" + getAria() + ".";
    }
    public float getAria() {
        this.area = this.length * this.width;
        return area;
    }
}
