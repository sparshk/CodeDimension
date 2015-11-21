import java.util.*;
class oddeve
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array.");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the elements of array A");
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                b[c]=a[i];
                c=c+1;
            }
        }

        for(int i=n-1;i>=0;i--)
        {
            if(a[i]%2!=0)
            {
                b[c]=a[i];
                c=c+1;
            }
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(b[i]>b[j])
                {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("The array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
    }
}

