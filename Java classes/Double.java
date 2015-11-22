import java.util.*;
class Double
{
void main()
{
Scanner sc=new Scanner(System.in);
int m[]=new int[15];
int i;
for(i=0;i<15;i++)
{
System.out.println("Enter number"+" "+(i+1));
m[i]=sc.nextInt();
}
for(i=0;i<15;i++)
{
int ab=m[i];
m[i]=2*ab;
}
System.out.println("The new array is:");
for(i=0;i<15;i++)
{
System.out.print(m[i]);
}
}
}
