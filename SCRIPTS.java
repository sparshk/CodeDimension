import java.util.*;
class SCRIPTS
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the scores one by one.");
System.out.println("Enter 100 to stop entering marks.");
int ctr=0,ctr1=0;
int n=0;
double per=0.0;
String str="";
do
{
n=sc.nextInt();
if(n<100)
ctr++;
if(n<=39)
ctr1++;
if(n==100)
break;
}
while(n!=100);
per=(ctr1*100)/ctr;
System.out.println("The number of answer scripts marked="+ctr);
System.out.println("The % of students getting less than 39="+per);
}
}

