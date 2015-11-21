import java.util.*;
class firstchar
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
str=' '+str;
str=str.toUpperCase();
int len=str.length();
String str1="";
for(int i=0;i<len;i++)
{
char ch=str.charAt(i);
if(Character.isWhitespace(ch))
{

str1=str.charAt(i+1)+".";
System.out.print(str1);
}
}
}
}