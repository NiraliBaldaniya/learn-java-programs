import java.util.Scanner;
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of element : ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++)
        {
            int next = a + b;
            a = b;
            b = next;
            System.out.print(next+" ");
        }
    }
}