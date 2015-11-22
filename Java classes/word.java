import java.util.*;
class word
{
boolean fullstop(String sen)
{
boolean isokay;
char ch=sen.charAt(sen.length()-2);
if(ch=='.')
isokay=true;
else
isokay=false;
return isokay;
}
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str=" "+sc.nextLine()+" ";
String word="";
int ctr=0;
if(fullstop(str)==true)
{
System.out.println("Enter a word to be searched");
String str1=sc.nextLine();
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch==' ')
{
word=str.substring(i);
}
word=word.substring(1);
word=word.substring(0,word.indexOf(' '));
if(word==str1)
ctr++;
word="";
}
if(ctr>0)
System.out.println("Frequency of the word="+ctr);
else
System.out.println("No match found");
}
else
System.out.println("Wrong input!!Please try again");
}
}


