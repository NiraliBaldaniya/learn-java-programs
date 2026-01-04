import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number ");
        int a = input.nextInt();
        System.out.println("enter second number ");
        int b = input.nextInt();

        //addition
        int addition = a + b;
        System.out.println("The addition is : " + addition);

        //substraction
        int subtraction = a - b;
        System.out.println("The subtraction is : " + subtraction);

        //multiplication
        int multiplication = a * b;
        System.out.println("The multiplication is : " + multiplication);

        //division
        int division = a / b;
        System.out.println("The division is : " + division);
    }
}
