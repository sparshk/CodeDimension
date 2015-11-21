import java.util.*;
class practice1
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the array.");
int n=sc.nextInt();
String str[]=new String[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the name of the cities.");
str[i]=sc.next().toUpperCase();
}
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-i-1;j++)
{
if(str[j].compareTo(str[j+1])>0)
{
String temp=str[j];
str[j]=str[j+1];
str[j+1]=temp;
}
}
}
System.out.println();
System.out.println("In alphabetical order:");
for(int i=0;i<n;i++)
System.out.println(str[i]);
}
}