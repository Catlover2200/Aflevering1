import java.util.*;
public class Surname {
    //Methods 4
    public static void main(String[] args) {
        Scanner enterName = new Scanner(System.in);
        System.out.println("Enter full name");

        String name = enterName.nextLine();
        System.out.println("Full name is: " + name);
        System.out.print("Initials is: ");

        int nameLength = name.length();
        name = name.trim();

        String firstName = "";
        for (int i = 0; i < nameLength; i++) {
            char initial = name.charAt(i);

            if (initial != ' ') {
                firstName = firstName + initial;
            }

            else {
                System.out.print(Character.toUpperCase(firstName.charAt(0)) + ". ");
                firstName = "";
            }
        }
        String lastName = "";
        for (int j = 0; j < firstName.length(); j++) {

            if (j == 0)
                lastName = lastName + Character.toUpperCase(firstName.charAt(0));

            else lastName = lastName + Character.toLowerCase(firstName.charAt(j));
        }
        System.out.println(lastName);
    }
}