import java.util.Scanner;
public class EvenOrOdd {
    //Methods 3
    public static void main(String[] args) {

        Scanner evenOrOdd = new Scanner(System.in);
        System.out.println("Enter number");

        int number = evenOrOdd.nextInt();  // Read user input

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }

        else {
            System.out.println(number + " is odd");
        }

    }
}
