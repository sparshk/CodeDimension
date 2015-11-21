import java.util.*;
class perf_pa
{
void main()
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int i;
for(i=0;i<5;i++)
{
System.out.println("Enter element number-"+(i+1));
a[i]=sc.nextInt();
}
int rem,j;
int rev=0,sum=0;
System.out.println("The perfect numbers in the array are:");
for(i=0;i<5;i++)
{
int n=a[i];
for(j=1;j<a[i];j++)
{
if(a[i]%j==0)
sum=sum+j;
}
if(sum==n)
System.out.println(n);
}
System.out.println("The palindrome numbers are:");
for(i=0;i<5;i++)
{
int b=a[i];
while(a[i]>0)
{
rem=a[i]%10;
rev=(rev*10)+rem;
a[i]=a[i]/10;
}
if(rev==b)
System.out.println(b);
}
}
}

