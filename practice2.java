import java.util.*;
class practice2
{
    int factsum(int x)
    {
        int sum=0;
        for(int i=1;i<x;i++)
        {
            if(x%i==0)
                sum=sum+i;
        }
        return sum;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Palindrome.");
        System.out.println("Enter 2 for perfect.");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("Enter the number");
            int x=sc.nextInt();int temp=x;
            int sum=0;
            while(x>0)
            {
                int a=x%10;
                sum=sum*10+a;
                x=x/10;
            }
            if(sum==temp)
                System.out.println("The number is palindrome.");
            else
                System.out.println("Not a palindrome number.");
            break;
            case 2:
            System.out.println("Enter the number.");
            int a=sc.nextInt();
            int sum1=factsum(a);
            if(a==sum1)
                System.out.println("The number is a perfect number.");
            else
                System.out.println("The number is not a perfect number.");
            break;
            default:
            System.out.println("Wrong choice.Please try again!");
        }
    }
}