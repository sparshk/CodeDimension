import java.util.*;
class Frequency1
{
void main()
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the string");
String str=sc.nextLine().trim()+" ";
System.out.println("Enter the word to be searched");
String str1=sc.nextLine();
int len=str.length();
int ctr=0;char ch=' ';String str2="";
for(int i=0;i<len;i++)
{
ch=str.charAt(i);
if(ch!=' ')
str2=str2+ch;
else if(str2.equalsIgnoreCase(str1)==true)
{
ctr+=1;
str2="";
}
}
if(ctr>0)
System.out.println("The frequency of the searched word is="+ctr);
else
System.out.println("The searched word is not found.");
}
}
