
public class Main {

    public static void main(String[] args) {

        Car Cory = new Car();
        System.out.println(Cory);
        Cory.price = 20;
        Cory.model = "Obel";
        Cory.start = true;
        Cory.stop = false;
        Cory.move = true;

        System.out.println(Cory.price);
        System.out.println(Cory.model);
        System.out.println(Cory.start);
        System.out.println(Cory.stop);
        System.out.println(Cory.move);

        Driver Dianna = new Driver();
        System.out.println(Dianna);

        Dianna.name = "Dianna";
        Dianna.age = 87;

        System.out.println(Dianna.name);
        System.out.println(Dianna.age);
        Dianna.drive();


        Employee Wilma = new Employee("Wilma", "Kat", 15000);
        Employee Ritt = new Employee("Ritt", "Bjerregaard", 20000);

        System.out.println(Wilma.getFirstName() + "'s monthly salary is " + Wilma.getMonthlySalary());
        System.out.println(Ritt.getFirstName() + "'s monthly salary is " + Ritt.getMonthlySalary());

        Wilma.setMonthlySalary(Wilma.getMonthlySalary() * 1.1);
        Ritt.setMonthlySalary(Ritt.getMonthlySalary() * 1.1);

        System.out.println("Salary after 10% boost");
        System.out.println(Wilma.getFirstName() + "'s monthly salary is " + Wilma.getMonthlySalary());
        System.out.println(Ritt.getFirstName() + "'s monthly salary is " + Ritt.getMonthlySalary());
            }
        }