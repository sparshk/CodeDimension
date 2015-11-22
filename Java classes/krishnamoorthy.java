import java.util.*;
class krishnamoorthy
{
int factorial(int n)
{
int prod=1;
for(int i=1;i<=n;i++)
{
prod=prod*i;
}
return prod;
}
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int x=sc.nextInt();
int s=0;int sum=0;
int temp=x;
while(x>0)
{
s=x%10;
sum=sum+factorial(s);
x=x/10;
}
if(sum==temp)
System.out.println("Krisnamoorthy number");
else
System.out.println("Not a krishnamoorthy number");
}
}
