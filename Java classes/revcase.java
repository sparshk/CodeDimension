import java.util.*;
class revcase
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sentence.");
String str=sc.nextLine();
int len=str.length();
String str1="";
for(int i=0;i<len;i++)
{
char ch=str.charAt(i);
if(Character.isUpperCase(ch))
str1=str1+Character.toLowerCase(ch);
else
str1=str1+Character.toUpperCase(ch);
}
System.out.println("The new string is="+str1);
}
}