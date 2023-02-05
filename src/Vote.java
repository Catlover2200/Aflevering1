import java.util.Scanner;
public class Vote {
    //Methods 1
    public static void main(String[] args) {
        Scanner enterAge = new Scanner(System.in);
        System.out.println("Enter age");

        int age = enterAge.nextInt();
        System.out.println("Age is: " + age);

        if (age < 18) {
            System.out.println("Too young! You are not eligible to vote");
        }

        else {
            System.out.println("Accepted! you are eligible to vote");
        }

    }

}