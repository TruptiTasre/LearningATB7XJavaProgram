package Homework_200724;

public class HW_003 {
    public static void main(String[] args) {
        int side1 = 1; // Replace with the lengths of your triangle's

        int side2 = 2;
        int side3 = 3;
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }

}
