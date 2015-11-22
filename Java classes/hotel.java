import java.util.*;
class hotel
{
void main()
{
Scanner sc=new Scanner(System.in);
String m[][]=new String[2][5];
int i,j;
for(i=0;i<2;i++)
{
for(j=0;j<5;j++)
{
System.out.println("Enter the name of the visitor living on"+" "+(i+1)+"st floor in room no"+" "+(j+1));
m[i][j]=sc.nextLine();
}
}
System.out.println("Enter the name of the visitor to know his or her position");
String name=sc.nextLine();
for(i=0;i<2;i++)
{
for(j=0;j<5;j++)
{
if(m[i][j].equalsIgnoreCase(name)==true)
{
System.out.println("Mr."+" "+name+"lives on"+(i+1)+"st floor in room number"+" "+(j+1));
break;
}
}
}
}
}