import java.util.Scanner;

public class ManavProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilo : ");
        toplam += armut * input.nextDouble();
        System.out.println("Elma kaç kilo : ");
        toplam += elma * input.nextDouble();
        System.out.println("Domates kaç kilo : ");
        toplam += domates * input.nextDouble();
        System.out.println("Muz kaç kilo : ");
        toplam += muz * input.nextDouble();
        System.out.println("Patlıcan kaç kilo : ");
        toplam += patlican * input.nextDouble();

        System.out.println("Toplam Tutar : " + toplam);
    }
}
