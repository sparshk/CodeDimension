import java.util.*;
public class magic
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number.It should not be of more than three digits.");
int n=sc.nextInt();
int rev=0,sum=0,sum1=0;
while(n>0)
{
rev=n%10;
sum=sum+rev;
n=n/10;
if(sum>9)
{
while(sum>0)
{
int rev1=sum%10;
sum1=sum1+rev1;
sum=sum/10;
}
}
}
if(sum1==1)
System.out.println("Magic number");
else
System.out.println("Not a magic number");
}
}
