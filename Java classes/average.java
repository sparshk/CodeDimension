import java.util.*;
class average
{
String name;
int roll,p,c,b;
double s;
public average()
{
name="";
roll=0;
p=0;
c=0;
b=0;
s=0.0;
}
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter the roll no");
roll=sc.nextInt();
System.out.println("Enter the marks in physics, chemistry and biology");
p=sc.nextInt();
c=sc.nextInt();
b=sc.nextInt();
}
void calculate()
{
s=(p+c+b)/3;
}
void display()
{
System.out.println("Name"+ "\t" + "Roll no" + "\t" + "Science marks");
System.out.println(name + "\t" + roll + "\t" + s );
}
}
