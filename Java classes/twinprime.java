import java.util.*;
class twinprime
{
boolean number1(int a)
{
boolean ans=true;
int ctr=0;
for(int i=1;i<=a;i++)
{
if(a%i==0)
ctr++;
}
if(ctr==2)
ans=true;
else
ans=false;
return ans;
}
boolean number2(int b)
{
boolean ans=true;
{
int ctr=0;
for(int i=1;i<=b;i++)
{
if(b%i==0)
ctr++;
}
if(ctr==2)
ans=true;
else
ans=false;
return ans;
}
}
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers.First smaller and then bigger");
int a=sc.nextInt();
int b=sc.nextInt();
int m=0;
boolean ans1=number1(a);
boolean ans2=number2(b);
if(ans1==true&&ans2==true)
{
 m=b-a;
if(m==2)
System.out.println("Twin prime");
else
System.out.println("Not Twin Prime");
}
else
System.out.println("They are not prime.Please try again.");

}
}





