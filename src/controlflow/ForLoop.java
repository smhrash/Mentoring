package controlflow;

public class ForLoop {

    // Loop is allowing us to Execute a statement or group of statements multiple times

    public static void main(String[] args) {

        // parent for loop
        for(int x=0; x<=5; x++){
            System.out.println("We are learning Java");

            // child for loop
            for(int y=0; y<=2; y++){
                System.out.println("This is child class");
            }

        }
    }
}
