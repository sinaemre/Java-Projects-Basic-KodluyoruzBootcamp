import java.util.Scanner;

public class TamBolunenSayılar {
    public static void main(String[] args) {
        int sayi, sayac = 0, toplam = 0, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen sayıyı giriniz : ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++)
        {
            if (i % 3 == 0 && i % 4 == 0)
            {
                toplam += i;
                sayac++;
            }
        }

        sonuc = toplam / sayac;

        System.out.println(sayi + " sayısına kadar olan sayıların 3 ve 4 ile bolunebilenlerin ortalaması : " + sonuc);
    }
}
