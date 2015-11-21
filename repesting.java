import java.util.*;
class repesting
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
int ctr=0;
for(int i=0;i<str.length()-1;i++)
{
char ch=str.charAt(i);
for(int j=i+1;j<=i+1;j++)
{
char ch1=str.charAt(j);
if(ch==ch1)
ctr++;
}
}
if(ctr>0)
System.out.println("No of double letters="+ctr);
else
System.out.println("No double letters");
}
}