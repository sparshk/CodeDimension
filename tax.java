import java.util.*;
public class tax
{
public static void main()
{
double ded;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the annual income");
int ai=sc.nextInt();
{
if(ai>=100001&&ai<=150000)
ded=0.10*ai;
else if(ai>=150001&&ai<=200000)
ded=5000+(0.20*ai);
else
ded=15000+(0.30*ai);
}
System.out.println("The annual tax deduction is="+ded);
}
}
