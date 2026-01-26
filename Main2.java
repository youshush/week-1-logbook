import java.util.Scanner;


public class Main2 { 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // made this scanner to read user input

        System.out.print("enter your name:"); // asking the user for their name 
        String name = input.nextLine();

        System.out.println("Hello " + name + "!"); // making the message

        input.close(); // closing the scanner


    }

    
}
