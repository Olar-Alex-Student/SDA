package Ex_3;

import Ex_2.Punct;

import java.io.*;
import java.util.Scanner;

public class Poligon {
    public Punct[] varfuri;
    public String[] varfuriString;
    public int nrVarfuri;
    public Poligon() throws Exception {
        try {
            File file = new File("D:\\SDA\\Laboratoare\\Lab1\\Lab1.txt");
            Scanner myReader = new Scanner(file);
            this.nrVarfuri = Integer.parseInt(myReader.nextLine());
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }



}
