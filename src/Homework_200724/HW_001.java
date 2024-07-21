package Homework_200724;

import java.util.Scanner;

//code for Leap years
public class HW_001 {
    public static void main(String[] args) {
        System.out.println("Enter year:");
        Scanner sc = new Scanner(System.in);
         int year = sc.nextInt();
        if((year%400) == 0 || (year%4) == 0 && (year%100) != 0){
            System.out.println("leap Year");
        } else {
            System.out.println("leap not Year");
        }
    }}
