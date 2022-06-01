import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int sayi, carpanToplam=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = sc.nextInt();

        for(int i=1; i<sayi; i++){
            if (sayi % i==0) {
                carpanToplam+=i;
            }
        }

        if (carpanToplam==sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}