import java.util.*;
class longest
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string.");
String str=sc.nextLine();
int len=str.length();
String max="";int max1=1,min1=1;
String min="a";String str1="";String word="";
for(int i=0;i<len;i++)
{
char ch=str.charAt(i);
if(ch!=' ')
{
word=word+ch;
}
else if(word.length()>max1)
max=word;
else
min=word;
word="";
}
System.out.println("The longest word="+max);
System.out.println("The shortest word is="+min);
}
}
