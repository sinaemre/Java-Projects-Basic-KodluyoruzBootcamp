import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        double r, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz : ");
        r = input.nextFloat();

        alan = Math.PI * r * r;
        cevre = 2 * Math.PI * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

    }
}
