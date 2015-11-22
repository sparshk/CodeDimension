import java.util.*;
class array
{
void main()
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int b[]=new int[10];
int c[]=new int[20];
for(int i=0;i<10;i++)
{
System.out.println("Enter the elements in array 1:");
a[i]=sc.nextInt();
System.out.println("Enter the elements in array 2:");
b[i]=sc.nextInt();
}
int z=0;
for(int i=0;i<10;i++)
{
c[i+z]=a[i];
c[i+z+1]=b[i];
z=z+1;
}
System.out.println("The new array:");
for(int i=0;i<20;i++)
{
System.out.println(c[i]);
}
}
}