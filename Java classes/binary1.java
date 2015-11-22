import java.util.*;
class binary1
{
void main()
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<10;i++)
{
System.out.println("Enter the number:");
a[i]=sc.nextInt();
}
for(int i=0;i<9;i++)
{
for(int j=i+1;j<10;j++)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("In ascending order");
for(int i=0;i<10;i++)
{
System.out.println(a[i]);
}
}
}



