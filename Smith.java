import java.util.*;
class Smith
{
    int add(int x)
    {
        int sum=0,rem=0;
        while(x>0)
        {
            rem=x%10;
            sum=sum+rem;
            x=x/10;
        }
        return sum;
    }

    boolean prime(int x)
    {
        int ctr=0;boolean flag=false;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
                ctr++;
        }
        if(ctr==2)
            flag=true;
        else
            flag=false;
        return flag;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the number to be checked:");
        int x=sc.nextInt();
        int sum=add(x);
        int sum1=0;
        boolean check=false;
        for(int i=2;i<=x;i++)
        {
            if(x%i==0)

            {
                x=x/i;

                check=prime(i);
                if(check==true&&i>10)
                {
                    int add1=add(i);
                    sum1=sum1+add1;
                }
                else if(check==true)
                {
                    sum1=sum1+i;
                }
                i=2;
            }

        }
        if(sum1==sum)
            System.out.println("It is a smith number.");
        else
            System.out.println("It is not a smith number.Thank you!");
    }
}

