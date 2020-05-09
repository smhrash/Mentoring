package controlflow;

import java.util.Scanner;

public class IfElse{

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("please enter your pain rate (1-10)");

            int painRate = input.nextInt();


            if (painRate <= 3 && painRate >=1) {

            System.out.println("Patient is suffering with mild pain");

            } else if (painRate <= 4 && painRate>=4) {
                System.out.println("Patient is suffering with moderate pain");

            } else if (painRate <= 6 && painRate>=5) {
                System.out.println("Patient is suffering with severe pain");

            }else if (painRate <=9 && painRate>=7) {
                System.out.println("Patient is suffering with very severe pain");

            }else if (painRate <= 10 && painRate>=10) {
                System.out.println("Patient is suffering with Worst pain possibly");
            }
            else {
                System.out.println("Patient entered invalid pain rate");
            }

        }

}