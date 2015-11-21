import java.util.*;
class duck
{
void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int rev=0,ctr=0;
while(n>0)
{
rev=n%10;
if(rev==0)
ctr++;
n=n/10;
}
if(ctr>0)
System.out.println("Duck number");
else 
System.out.println("Not a duck number");


}

}









 