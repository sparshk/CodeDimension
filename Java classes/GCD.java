import java.util.*;
class GCD
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for BUZZ number.");
System.out.println("Enter 2 for GCD.");
System.out.println("Enter your choice.");
int ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter the number");
int n=sc.nextInt();
if(n%7==0||n%10==7)
System.out.println("Buzz number");
else
System.out.println("Not a Buzz number");
break;
case 2:
System.out.println("Enter the first integer");
int a=sc.nextInt();
System.out.println("Enter the second integer");
int b=sc.nextInt();
int r=1;
int high=0;
int low=0;
if(a>b)
{
high=a;
low=b;
}
else
{
high=b;
low=a;
}
while(r>0)
{
r=high%low;
if(r==0)
break;
else
{
high=low;
low=r;
}
}
System.out.println("The GCD is:"+low);
break;
default:System.out.println("Wrong choice");
}
}
}

