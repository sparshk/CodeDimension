import java.util.*;
class piglatin
{
String preset(String str1)
{
int len=str1.length();
str1=str1.toUpperCase();
String w="";
for(int i=0;i<len;i++)
{
char ch=str1.charAt(i);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
w=str1.substring(i)+str1.substring(0,i)+"AY";
break;
}
}
return w;
}
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sentence");
String str2=sc.nextLine()+' ';
int len=str2.length();
String word="",output="";
for(int i=0;i<len;i++)
{
char ch=str2.charAt(i);
word=word+ch;

if(ch==' ')                     
{
            word=word.trim();
            output=output+preset(word)+" ";
            word="";
}
}
System.out.println(output);
}
}





