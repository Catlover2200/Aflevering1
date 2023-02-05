import java.util.Scanner;
public class Sum {
    //Methods 2
    public static void main (String[] args){
        Scanner enterSum = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = enterSum.nextInt();

        System.out.println("Enter second number");
        int number2 = enterSum.nextInt();

        System.out.println("Enter third number");
        int number3 = enterSum.nextInt();


        if (number1 <= number2 && number1 <= number3) {
            System.out.println("\nThe Smallest number is: "+number1);
        }

        else if (number2 <= number1 && number2 <= number3){
            System.out.println("\nThe Smallest number is: "+number2);
        }

        else {
            System.out.println("\nThe Smallest number is: "+number3);
        }

        if (number1 >= number2 && number1 >= number3){
            System.out.println("\nThe Biggest number is: "+number1);
        }

        else if (number2 >= number1 && number2 >= number3){
            System.out.println("\nThe Biggest number is: "+number2);
        }

        else {
            System.out.println("\nThe Biggest number is: "+number3);
        }
    }
}
