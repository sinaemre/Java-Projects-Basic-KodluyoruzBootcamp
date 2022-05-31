import java.util.Scanner;

public class DersGecme {
    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, muzik;

        //Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunu girin: ");
        mat = input.nextInt();

        System.out.print("Fizik notunu girin: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu girin: ");
        kimya = input.nextInt();

        System.out.print("Tarih notunu girin: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu girin: ");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + tarih + muzik;

        double sonuc = toplam / 5;

        if (sonuc <= 55)
            System.out.println("Sınıfta kaldınız.");
        else
            System.out.println("Tebrikler sınıfı geçtiniz!!");

        System.out.println("Ortalamanız : " + sonuc);
    }
}
