import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, secim, sonuc;
        String negative;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n 2)Çıkarma\n 3)Çarpma\n 4)Bölme");
        System.out.println("Seçiminizi yapınız : ");
        secim = input.nextInt();

        switch (secim)
        {
            case 1:
                sonuc = n1 + n2;
                System.out.println("İşlem sonucunuz : " + sonuc);
            case 2:
                sonuc = n1 - n2;
                System.out.println("İşlem sonucunuz : " + sonuc);
            case 3:
                sonuc = n1 * n2;
                System.out.println("İşlem sonucunuz : " + sonuc);
            case 4:
                if (n2 != 0) {
                    sonuc = n1 / n2;
                    System.out.println("İşlem sonucunuz : " + sonuc);
                }
                else
                    System.out.println("Bir sayı sıfıra bölünemez!");
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }

    }
}
