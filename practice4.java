import java.util.*;
class practice4
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for a triangle and 2 for a inverted triangle.");
int ch=sc.nextInt();
System.out.println("Enter the number of terms.");
int n=sc.nextInt();
switch(ch)
{
case 1:
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
System.out.print(i);
System.out.println();
}
break;
case 2:
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
System.out.print(i);
System.out.println();
}
break;
default:
System.out.println("Wrong choice.Please try again.");
}
}
}