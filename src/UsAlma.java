import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args){

        // Girilen değerlere göre üslü sayıyı hesaplama

        int tab, us, sonuc = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Tabani giriniz : ");
        tab = inp.nextInt();
        System.out.print("Us giriniz : ");
        us = inp.nextInt();

        for (int i = 1; i <= us; i++){
            sonuc *= tab;
        }
        System.out.println("Sonuc : " + sonuc);
    }
}