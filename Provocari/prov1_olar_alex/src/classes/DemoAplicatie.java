package classes;

import classes.Abstractisations.IDemoAplicatie;

import java.util.Scanner;

public class DemoAplicatie implements IDemoAplicatie {
    public void readForPatrat(Patrat patrat) {
        //Scanner Init
        Scanner scanner = new Scanner(System.in);

        //Read Values
        System.out.println("Alege valorile pentru Patrat:");

        System.out.println("Lungime:");
        patrat.length = scanner.nextFloat();

        //Write The Result
        System.out.println(patrat.toString());

    }
    public void readForDreptunchi(Dreptunghi dreptunghi) {
        //Scanner Init
        Scanner scanner = new Scanner(System.in);

        //Read Values
        System.out.println("Alege valorile pentru Dreptunghi:");

        System.out.println("Lungime:");
        dreptunghi.length = scanner.nextFloat();

        System.out.println("Latime:");
        dreptunghi.width = scanner.nextFloat();

        //Write The Result
        System.out.println(dreptunghi.toString());

    }
    public void readForGresie(Gresie gresie) {
        //Scanner Init
        Scanner scanner = new Scanner(System.in);

        //Read Values
        System.out.println("Alege valorile pentru Gresie:");

        System.out.println("Lungime:");
        gresie.length = scanner.nextFloat();

        System.out.println("Latime:");
        gresie.width = scanner.nextFloat();

        System.out.println("Inaltime:");
        gresie.height = scanner.nextFloat();

        //Write The Result
        System.out.println(gresie.toString());

    }
}
