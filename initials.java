import java.util.*;
class initials
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=" " + sc.nextLine();
int ch=str.lastIndexOf(' ');
String str2=str.substring(ch)+" ";
for(int i=ch-1;i>=0;i--)
{
char ch1=str.charAt(i);
if(ch1==' ')
{
str2=str2+str.charAt(i+1)+".";
}
}
System.out.println("The other form is="+str2);
}
}

