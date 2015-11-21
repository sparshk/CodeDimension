import java.util.*;
class checkfibon
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int x=sc.nextInt();
int n1=0,n2=1;
int sum=0;
for(int i=0;i<x;i++)
{
sum=n1+n2;
n1=n2;
n2=sum;
if(sum==x)
{
System.out.println("The number is in fibonacci series.");
break;
}
else if(sum>x)
break;
}
}
}