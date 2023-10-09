import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {

        //Ec1
        EcuatieGrad1 ecuatieGrad1 = new EcuatieGrad1(1,2);
        System.out.println(ecuatieGrad1.toString());
        System.out.println(ecuatieGrad1.rezolva());

        //Pct
        Punct p1 = new Punct();
        Punct p2 = new Punct(3,0);
        System.out.println(p1.toString());
        System.out.println(p1.distanta(p2));

        //Poligon
        Poligon poligon = new Poligon();
    }
}