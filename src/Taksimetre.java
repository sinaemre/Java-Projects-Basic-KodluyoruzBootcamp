import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int yol, sabitUcret = 10;
        double totalUcret;
        Scanner input = new Scanner(System.in);
        System.out.println("Kilometreyi yazınız : ");
        yol = input.nextInt();
        totalUcret = (yol * 2.20) + sabitUcret;
        if (totalUcret < 20)
            totalUcret = 20;
        System.out.println("Toplam ücretiniz : " + totalUcret);

    }
}
