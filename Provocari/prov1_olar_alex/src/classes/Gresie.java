package classes;

import classes.Abstractisations.IGresie;

public class Gresie implements IGresie {

    public float length;
    public float width;
    public float height;
    public float volume;
    public String toString() {
        return "Volumul este:" + getVolum() + ".";
    }
    public float getVolum() {
        this.volume = this.length * this.width * this.height;
        return volume;
    }
}
