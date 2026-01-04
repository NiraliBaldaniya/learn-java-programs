import java.util.Scanner;
class min5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter five numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        
        int min;
        
        min=a;
        
        if (min>b)
            min=b;
        if (min>c)
            min=c;
        if (min>d)
            min=d;
        if (min>e)
            min=e;
        
        System.out.println("minimum number is : "+min);
    }
}