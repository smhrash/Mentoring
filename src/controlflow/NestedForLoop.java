package controlflow;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {

        // output
        // 1
       //  1 2
        // 1 2 3
        // 1 2 3 4
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        
        int numOfRow = input.nextInt();

        for (int i = 1; i <= numOfRow; i++) {

            for (int j = 1; j <= i; j++) {


                System.out.print(j+" ");

            }

            System.out.println();
        }
    }
}
