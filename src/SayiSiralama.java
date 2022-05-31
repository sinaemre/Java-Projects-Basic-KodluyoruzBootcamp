import java.util.Scanner;

public class SayiSiralama {

    public static void main(String[] args) {
        // Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

        int a,b,c ;

        Scanner scan = new Scanner(System.in) ;

        System.out.print("lütfen 1'inci sayıyı giriniz : ");
        a = scan.nextInt();
        System.out.print("lütfen 2'inci sayıyı giriniz : ");
        b = scan.nextInt();
        System.out.print("lütfen 3'inci sayıyı giriniz : ");
        c = scan.nextInt();

        if ((a > b) && (a >c)) {
            if (b > c) {
                System.out.println("a > b > c");
            }else {
                System.out.println("a > c > b ");
            }
        }else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        }else if ((c >a )&& (c>b))  {
            if (b >a) {
                System.out.println("c > b > a");
            }else {
                System.out.println("c > a > b");
            }

        }
    }

}
