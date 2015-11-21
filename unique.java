import java.util.*;
class unique
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the number:");
        int x=sc.nextInt();
        int temp=x;
        int ctr=0;
        while(x>0)
        {
            int rem=x%10;
            temp=x/10;
            while(temp>0)
            {
                int rem1=temp%10;
                temp=temp/10;
                if(rem==rem1)
                    ctr=ctr+1;
            }
            x=x/10;
        }
        if(ctr==0)
            System.out.println("The number is unique.");
        else
            System.out.println("The number is not unique.");
    }
}
