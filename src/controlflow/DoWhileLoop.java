package controlflow;

public class DoWhileLoop {

    // Post condition check;
    // Do While Loop execute at least one time then it will check condition.
    // Do {} while ()


    public static void main(String[] args) {

        int age= 20;

        do {
            System.out.println("You are adult");

            age--;
        }while( age>=18);
    }
}
