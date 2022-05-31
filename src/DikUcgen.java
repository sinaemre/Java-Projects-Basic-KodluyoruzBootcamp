import java.util.Scanner;
public class DikUcgen {
    public static void main(String[] args) {
        int k1, k2;
        double hipo;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz : ");
        k1 = input.nextInt();
        System.out.println("İkinci kenarı giriniz : ");
        k2 = input.nextInt();

        hipo = Math.sqrt ((k1 * k1) + (k2 * k2));
        System.out.println("Hipotenüs : " + hipo);



    }
}
