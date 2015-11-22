import java.util.*;
public class fine
{
public static void main()
{
double fine;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of days");
int days=sc.nextInt();
{
if(days<=5)
 fine=0.40*days;
else if(days>=6&&days<=10)
fine=0.65*days;
else 
fine=0.80*days;
}
System.out.println("The no of days are="+days);
System.out.println("The fine is="+fine);
}
}

