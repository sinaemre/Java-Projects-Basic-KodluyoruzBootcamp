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
        if (mat < 0 || mat > 100)
            mat = 0;
        if (fizik < 0 || fizik > 100)
            fizik = 0;
        if (kimya < 0 || kimya > 100)
            kimya = 0;
        if (tarih < 0 || tarih > 100)
            tarih = 0;
        if (muzik < 0 || muzik > 100)
            muzik = 0;

        int toplam = mat + fizik + kimya + tarih + muzik;

        double sonuc = toplam / 5;

        if (sonuc <= 55)
            System.out.println("Sınıfta kaldınız.");
        else
            System.out.println("Tebrikler sınıfı geçtiniz!!");

        System.out.println("Ortalamanız : " + sonuc);
    }
}
