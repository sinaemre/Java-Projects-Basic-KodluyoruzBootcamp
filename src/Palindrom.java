import java.util.Scanner;

public class Palindrom {
    static String isPalindrom(int sayi){
        int geciciSayi=sayi, tersSayi=0, sonSayi;

        while (geciciSayi != 0){
            sonSayi=geciciSayi%10;
            tersSayi=tersSayi*10 + sonSayi;
            geciciSayi=geciciSayi/10;
        }
        return  tersSayi==sayi ? sayi+" sayisi palindram sayıdır." : sayi+" sayisi palindram sayı değildir.";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int input=sc.nextInt();
        System.out.println(isPalindrom(input));

    }
}