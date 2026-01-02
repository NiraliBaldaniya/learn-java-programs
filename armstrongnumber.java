import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter armstrong number");
        int number = sc.nextInt();
        
        int result=0,remainder;

        int original=number;
        while(original!=0)
        {
            
            remainder=original % 10;
            result= result+remainder*remainder*remainder;
            original=original/10;
            
        }
        
        if(result==number)
        {
            System.out.println("this number is armstrong number");
        }
        else
        {
            System.out.println("this number is not armstrong number");
        }

    }
}