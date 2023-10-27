import Ex_1.EcuatieGrad1;
import Ex_2.Punct;
import Ex_3.Poligon;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            // Ex_1
            System.out.println("Ex1:");
            EcuatieGrad1 ecuatieGrad1 = new EcuatieGrad1(0, 1);
            System.out.println("Ecuatia este:");
            System.out.println(ecuatieGrad1.toString());
            System.out.println("Si raspunsul la ecuatie: " + ecuatieGrad1.rezolva());

            System.out.println();

            // Ex_2
            System.out.println("Ex2:");
            Punct punct_1 = new Punct();
            Punct punct_2 = new Punct(1,5);
            punct_1.setY(2);
            punct_1.setX(5);
            System.out.println("Distanta dintre " + punct_1 + "si " + punct_2 + " este:");
            System.out.println(punct_1.distanta(punct_2));

            System.out.println();

            // Ex_3
            System.out.println("Ex3:");
            Poligon poligon = new Poligon();
            poligon.Prelucreaza();
        }
        catch (Exception e) {

        }
    }
}