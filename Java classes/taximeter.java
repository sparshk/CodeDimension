import java.util.*;
class taximeter
{
int taxino;
String name;
int km;
int b;
taximeter()
{
taxino=0;
name="";
km=0;
b=0;
}
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
name=sc.nextLine();
System.out.println("Enter the taxi no");
taxino=sc.nextInt();
System.out.println("Enter the distance travelled");
km=sc.nextInt();
}
void calculate()
{
if(km<=1)
b=25;
else if(km<=6)
b=25+(km-1)*10;
else if(km<=12)
b=25+5*10+(km-5)*15;
else if(km<=18)
b=25+5*10+6*15+(km-12)*20;
else
b=25+5*10+6*15+6*20+(km-18)*25;
}
void display()
{
System.out.println("The taxino is="+taxino);
System.out.println("The name is="+name);
System.out.println("The distance travelled is="+km);
System.out.println("The billing amount="+b);
}
void main()
{
taximeter tm=new taximeter();
tm.input();
tm.calculate();
tm.display();
}
}
