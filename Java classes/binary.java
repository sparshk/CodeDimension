import java.util.*;
class binary
{
    int counter(int x)
    {
        int ctr=0;
        while(x>0)
        {
            int rem=x%2;
            x=x/2;
            ctr++;
        }
        return ctr;
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter a number:");
        int x=sc.nextInt();
        int n=counter(x);
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int rem=x%2;
            a[i]=rem;
            x=x/2;
        }
        System.out.println("The binary form is:");
        for(int i=n-1;i>=0;i--)
            System.out.print(a[i]);
    }
}