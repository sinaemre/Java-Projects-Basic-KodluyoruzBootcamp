import java.util.Scanner;
import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int[][] arrTranspose = new int[3][2];

        Scanner input = new Scanner(System.in);
        for (int i=0;i< arr.length;i++){

            for (int j = 0; arr[i].length > j; j++){
                System.out.print("Matrix "+"["+i+"]"+"["+j+"]"+":");
                arr[i][j]=input.nextInt();

            }
        }
        System.out.println("Matrix:");
        for (int i=0;i< arr.length;i++){

            for (int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("===========");
        System.out.println("Transpose:");
        for (int i=0; i < arrTranspose.length ;i++){

            for (int j=0;j<arrTranspose[i].length;j++){

                arrTranspose[i][j]=arr[j][i];
                System.out.print(arrTranspose[i][j]+" ");
            }
            System.out.println();
        }
    }
}