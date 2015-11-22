import java.util.*;
class special
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=0,sum=0;
        int temp=n;
        int prod=1;
        while(n>0)
        {
            rev=n%10;
            for(int i=1;i<=rev;i++)

                prod=prod*i;
            sum=sum+prod;
            prod=1;
            n=n/10;
        }

        if(sum==temp)
            System.out.println("Special number");
        else
            System.out.println("Not a special number");
    }
}


