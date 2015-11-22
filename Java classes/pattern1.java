public class pattern1
{
void main()
{
int m[][]=new int[3][3];
int i,j;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
if(i%2==0)
{
if(j%2==0)
System.out.print("0");
else 
System.out.print("1");
}
else
{
if(j%2==0)
System.out.print("1");
else 
System.out.print("0");
}
}
System.out.println();
}
}
}

