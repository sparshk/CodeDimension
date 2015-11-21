import java.util.*;
class icse
{
int vno;
int hours;
double bill;
icse()
{
vno=0;
hours=0;
bill=0.0;
}
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the vno.");
vno=sc.nextInt();
System.out.println("Enter the time.");
hours=sc.nextInt();
}
void calculate()
{
if(hours<=1)
bill=3;
else
bill=3+(hours-1)*1.50;
}
void display()
{
System.out.println(vno);
System.out.println(hours);
System.out.println(bill);
}
void main()
{
icse p=new icse();
p.input();
p.calculate();
p.display();
}
}

