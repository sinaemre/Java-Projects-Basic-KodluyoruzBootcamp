import java.util.Scanner;

public class PalindromikKelimeler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me Palindrom: ");
        String word= input.nextLine();
        if (isPalindrom(word)){
            System.out.println(word+" Palindrom kelime!");
        }else {
            System.out.println(word+" Palindrom kelime degil!");

        }


    }

    static  boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return  false;
            }
            i++;
            j--;
        }
        return true;
    }
}