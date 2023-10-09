import java.io.*;

public class Poligon {
    public Poligon() throws Exception {
        File file = new File("D:\\3132a\\Lab1\\Lab1.txt");
        BufferedReader br;
        br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

    Punct[] varfuri;
    int nrVrf;

}
