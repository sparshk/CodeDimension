import java.util.*;
class anagram
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two words");
String str=sc.nextLine();
String str1=sc.nextLine();
str=str.trim();
str1=str1.trim();
int len=str.length();
int len1=str1.length();
int t=0;
if(len==len1)
{
for(int i=0;i<len;i++)
{
char ch=str.charAt(i);
t=0;
for(int j=0;j<len1;j++)
{
char ch1=str1.charAt(j);
if(ch==ch1)
t++;
}
if(t==0)
break;
}
if(t==0)
System.out.println("Not anagram words");
else
System.out.println("Anagram words");
}
else
System.out.println("Wrong input!!Please try again.");
}
}