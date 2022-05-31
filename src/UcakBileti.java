import java.util.Scanner;

public class UcakBileti {

    public static void main(String[] args) {

        int age, way;
        double distance, oneWayPrice, multiWayPrice;

        double ageDiscount012 = 0.50;
        double ageDiscount1224 = 0.20;
        double ageDiscount65Plus = 0.30;
        double multiWayDiscount = 0.10;
        double distPerPrice = 0.10;

        Scanner inp = new Scanner(System.in);

        System.out.println("Welcome Java AirLines" + "\nPlease Chois Your Travel Details");

        System.out.print("Enter the distance (Unit - Km) :");
        distance = inp.nextDouble();

        System.out.print("Enter the Age :");
        age = inp.nextInt();

        System.out.print("For Oneway press : 1" + "\nFor Roundtrip press : 2 ");
        way = inp.nextInt();

        oneWayPrice = distance * distPerPrice;
        multiWayPrice = (2.0 * distance) * distPerPrice;

        switch (way) {
            case 1:
                if ((age > 0 && age <= 12)) {
                    System.out.println("Total Price : " + ((oneWayPrice) - (oneWayPrice * ageDiscount012)) + "$ .");
                } else if (age > 12 && age < 24) {
                    System.out.println("Total Price : " + ((oneWayPrice) - (oneWayPrice * ageDiscount1224)) + "$ .");
                } else if (age > 65) {
                    System.out.println("Total Price : " + ((oneWayPrice) - (oneWayPrice * ageDiscount65Plus)) + "$ .");
                } else {
                    System.out.println("Total Price : " + ((oneWayPrice)) + "$ .");
                }
                break;

            case 2:
                if ((age > 0 && age <= 12)) {
                    System.out.println("Total Price : "
                            + ((multiWayPrice) - (multiWayPrice * ageDiscount012) - (multiWayPrice * multiWayDiscount))
                            + "$ .");
                } else if (age > 12 && age < 24) {
                    System.out.println("Total Price : "
                            + ((multiWayPrice) - (multiWayPrice * ageDiscount1224) - (multiWayPrice * multiWayDiscount))
                            + "$ .");
                } else if (age > 65) {
                    System.out.println("Total Price : "
                            + ((multiWayPrice) - (multiWayPrice * ageDiscount65Plus) - (multiWayPrice * multiWayDiscount))
                            + "$ .");
                } else {
                    System.out.println("Total Price : " + ((multiWayPrice) - (multiWayPrice * multiWayDiscount)) + "$ .");
                }
                break;

            case 3:
                if (way != 1 && way != 2) {
                    System.out.println("You must select Oneway or MultiWay. Try Again. ");
                }
        }

    }

}