import java.util.*;
 class water
{
public static void main()
{
int tax;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the volume of water in gallons used");
int vol=sc.nextInt();
{
if(vol>45&&vol<=75)
 tax=  475;
else if(vol>75&&vol<=125)
 tax=750;
else if(vol>125&&vol<=200)
 tax=1225;
else if(vol>200&&vol<=350)
 tax=1659;
else
 tax=2000;
}
System.out.println("The tax to be collected is="+tax);
}
}

