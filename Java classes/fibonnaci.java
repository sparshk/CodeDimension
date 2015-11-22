import java.util.*;
class fibonnaci
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.print("\nEnter the number of terms you want of the fibonnaci series:");
int n=sc.nextInt();
int n1=0,n2=1;
int n3;
System.out.println("The fibonnaci series is as follows:");
System.out.println();
System.out.print(n1+" "+n2+" ");
for(int i=1;i<=n-2;i++)
{
n3=n1+n2;
System.out.print(n3+" ");
n1=n2;
n2=n3;
}
}
}