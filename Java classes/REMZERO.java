import java.util.*;
class REMZERO
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number.");
int n=sc.nextInt();
String str=Integer.toString(n);
int len=str.length();String str1="";
for(int i=0;i<len;i++)
{
char ch=str.charAt(i);
if(ch!='0')
{
str1=str1+ch;
}
}
System.out.println("The modified number is="+str1);
}
}
