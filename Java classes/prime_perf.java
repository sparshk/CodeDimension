import java.util.*;
class prime_perf
{
void main()
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int i;
int ctr=0,sum=0;
for(i=0;i<5;i++)
{
System.out.println("Enter number"+" "+(i+1));
a[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
for(int j=1;j<=a[i];j++)
{
if(a[i]%j==0)
ctr++;
}
if(ctr<=2)
System.out.println(a[i]+" "+"Is a prime number");
}
for(i=0;i<5;i++)
{
for(int j=1;j<a[i];j++)
{
if(a[i]%j==0)
sum=sum+j;
}
if(sum==a[i])
System.out.println(a[i]+" "+"Is a perfect number");
}
}
}
