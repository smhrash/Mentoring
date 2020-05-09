package controlflow;

import java.util.Scanner;

public class UseSwitchCase {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Food Manu ");
        int foodManu = input.nextInt();
        String foodName;
        switch (foodManu) {
            case 1:
                foodName = "Fried rice";
                break;
            case 2:
                foodName = "Vegetable Rice";
                break;
            case 3:
                foodName = "Chicken over Rice";
                break;
            case 4:
                foodName = "Lame Curry";
                break;
            case 5:
                foodName = "Beef Curry";
                break;
            case 6:
                foodName ="Lame Curry";
                break;
            default:
                foodName = "invalid food menu";
                break;
        }
        System.out.println("You've selected " + foodName);
    }
}
