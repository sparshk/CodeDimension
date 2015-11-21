import java.util.*;
class wordreverse
{
String reverse(String str)
{
String rev="";
int len=str.length();
for(int i=len-1;i>=0;i--)
{
char ch=str.charAt(i);
rev=rev+ch;
}
return rev;
}
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine()+" ";
int len=str.length();
String word="",output="";
for(int i=0;i<len;i++)
{
char ch=str.charAt(i);
word=word+ch;
if(ch==' ')
{
word=word.trim();
output=output+reverse(word)+" ";
word="";
}
}
System.out.println("The reversed string is="+output);
}
}
