import java.util.*;
class city
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the desired length of the array;");
int n=sc.nextInt();
String a[]=new String[n];
String b[]=new String[n];
int i,ctr=0;
int x=0;
for(i=0;i<n;i++)
{
System.out.println("Enter the city name");
a[i]=sc.nextLine();
System.out.println("Enter the pincode:");
b[i]=sc.nextLine();
}
System.out.println("Enter the name of city you want to search:");
String c=sc.nextLine();
for(i=0;i<n;i++)
{
if(c.equalsIgnoreCase(a[i])==true)
{
ctr++;
x=i;
}
}
if(ctr==1)
System.out.println(a[x]+"-"+b[x]);
else
System.out.println("Searched city not found.Try again!");
}
}
