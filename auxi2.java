import java.util.*;
class auxi2
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
        System.out.println("Enter 1 for series 1, 2 for series 2, 3 for series 3:");
        int n=sc.nextInt();
        System.out.println("Enter the number of terms:");
        int m=sc.nextInt();
        switch(n)
        {
            case 1:
            System.out.println("Enter the value of a");
            int a=sc.nextInt();
            double sum=0;int sign=1;
            for(int i=2;i<=m;i++)
            {
                sum=sum+(Math.pow(a,i)/factorial(i))*sign;
                sign=sign-1;
            }
            System.out.println("The sum of the series is="+sum);
            break;
            case 2:
            int sum1=0;int s=0,p=1;
            for(int i=1;i<=m;i++)
            {
                s=s+1;
                p=p*i;
                sum1=sum1+s/p;
            }
            System.out.println("The sum of this series is="+sum1);
            break;
            case 3:
            int n1=0,n2=1,n3=0;
            System.out.print(n1+" "+n2+" ");
            for(int i=1;i<=m-2;i++)
            {
                n3=n1+n2;
                System.out.print(n3+" ");
                n1=n2;
                n2=n3;
            }
            break;
        }
    }
}

