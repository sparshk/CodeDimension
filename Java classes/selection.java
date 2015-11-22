import java.util.*;
class selection
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the array");
int n=sc.nextInt();
int a[]=new int[n];
int i=0;
for(i=0;i<n;i++)
{
System.out.println("Enter the element at"+" "+(i+1)+" "+"position");
a[i]=sc.nextInt();
}
for(i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("In ascending order:");
System.out.println();
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}