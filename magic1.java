import java.util.*;
class magic1
{
    int sum(int x)
    {
        int sum=0;
        while(x>0)
        {
            int n=x%10;
            sum=sum+n;
            x=x/10;
        }
        return sum;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();
        int sum1=0;
        while(n>0)
        {
            sum1=sum(n);
            if(sum1>=10)
                n=sum(sum1);
            else if(sum1<10&&sum1!=1)
            {
                System.out.println("The number is not a magic no");
                break;
            }
            else if(sum1==1)
            {
                System.out.println("The number is magic.");
                break;
            }
        }
    }
}
