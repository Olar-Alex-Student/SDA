package usv.ro.magazin;

import java.util.ArrayList;

public class Magazin {
    private ArrayList<Pachet> listaVanzari;

    public Magazin() {
    }

    public void afisVanzari() {
        System.out.println(this.getListaVanzari());
    }

    public ArrayList<Pachet> getListaVanzari() {
        return this.listaVanzari;
    }

    public static void main(String[] args) {System.out.print("Hello and welcome!");
    }
}
