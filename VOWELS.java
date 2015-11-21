import java.util.*;
class VOWELS
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
str=str.toLowerCase();
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
int m=(int)ch;
str=str.replace((char)m,(char)(m+1));
}
}
System.out.println(str);
}
}

