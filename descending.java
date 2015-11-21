import java.util.*;
class descending
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the desired length of the array:");
int n=sc.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
System.out.println("Enter number"+" "+(i+1));
a[i]=sc.nextInt();
}
for(i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
int m=a[i];
a[i]=a[j];
a[j]=m;
}
}
}
System.out.println();
System.out.println("In descending order:");
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}

