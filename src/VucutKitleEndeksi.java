import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double boy, kilo, endeks;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu yazınız (m) : ");
        boy = input.nextDouble();
        System.out.println("Kilonuzu yazınız (m) : ");
        kilo = input.nextDouble();
        endeks = kilo / (boy * boy);

        System.out.println("Vücut Kitle Endeksiniz : " + endeks);
    }
}
