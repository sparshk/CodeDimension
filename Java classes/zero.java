import java.util.*;
class zero
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
str=str.toUpperCase();
str=str.replace('0','O');
System.out.println(str);
}
}

