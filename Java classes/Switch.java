import java.util.*;
class Switch
{
    int factorial(int x)
    {
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for series 1");
        System.out.println("Enter 2 for series 2");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        switch(ch)
        {
            case 1:

            double sum=0;
            for(int i=4;i<=4*n;i=i+4)
            {
                sum=sum+1/i;
                System.out.println("The sum of the series is="+sum);
            }

            break;
            case 2:
            double sum1=0;
            int fact=0;
            for(int i=1;i<=n;i++)
            {
                fact=factorial(i);
                if(i%2==0)
                    sum1=sum1-(i/fact);
                else
                    sum1=sum1+(i/fact);
            }
            System.out.println("The sum of the series is="+sum1);
            break;

            default:
            System.out.println("Wrong choice");

        }
    }
}