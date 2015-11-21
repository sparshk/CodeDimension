import java.util.*;
class disarium
{
    public int noofdigits(int x)
    {
        int ctr=0;
        while(x>0)
        {
            ctr=ctr+1;
            x=x/10;
        }
        return ctr;
    }

    public double calculate(int x)
    {
        int ctr1=noofdigits(x); double sum=0;
        while(x>0)
        {
            int rem=x%10;
            sum=sum+Math.pow(rem,ctr1);
            x=x/10;
            ctr1=ctr1-1;
        }
        return sum;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();
        double x=calculate(n);
        if(x==n)
            System.out.println("Disarium number.");
        else
            System.out.println("Not a Disarium number.");
    }
}

