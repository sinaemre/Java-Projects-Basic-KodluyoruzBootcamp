import java.util.Scanner;

public class KdvliTutar {
    public static void main(String[] args) {
    double tutar, kdvOran = 0.18;

    Scanner input = new Scanner(System.in);
    System.out.println("Ücret Tutarını giriniz : ");
    tutar = input.nextDouble();
    double kdvTutar = tutar * kdvOran;
    double toplamKdvliTutar = tutar + kdvTutar;
    System.out.println("Kdv'siz Tutar : " + tutar);
    System.out.println("Kdv Oranı : " + kdvOran);
    System.out.println("Kdv Tutarı : " + kdvTutar);
    System.out.println("KDV'li toplam tutar : " + toplamKdvliTutar);






    }
}
