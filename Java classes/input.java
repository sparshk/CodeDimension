import java.util.*;
class input
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the array.");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the element");
a[i]=sc.nextInt();
}
int b[]=new int[n+1];
System.out.println("Enter the element u want 2 insert:");
int x=sc.nextInt();
System.out.println("Enter the position.");
int pos=sc.nextInt();
for(int i=0;i<n+1;i++)
{
if(i==pos-1)
b[i]=x;
else if(i<pos-1)
b[i]=a[i];
else if(i>pos-1)
b[i]=a[i-1];
}
System.out.println("The modified array is=");
for(int i=0;i<n+1;i++)
System.out.println(b[i]);
}
}