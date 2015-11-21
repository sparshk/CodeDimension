import java.util.*;
class ascending
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of names you want to enter");
int n=sc.nextInt();
String a[]=new String[n];
String b[]=new String[n];
int i;String ab="",ac="";
for(i=0;i<n;i++)
{
System.out.println("Enter name"  + (i+1));
a[i]=sc.nextLine().toUpperCase();
System.out.println("Enter the number");
b[i]=sc.nextLine();
}
for(i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i].compareTo(a[j])>0)
{
ab=a[i];
a[i]=a[j];
a[j]=ab;
ac=b[i];
b[i]=b[j];
b[j]=ac;
}
}
}
System.out.println();
System.out.println("In ascending order");
for(i=0;i<n;i++)
System.out.println(a[i]+"-"+b[i]);
}
}




