import java.util.*;
class natural
{
void main()
{
Scanner sc=new Scanner(System.in);
int m[][]=new int[3][3];
int i,j,k;
int sum=0,sum1=0,sum2=0,sum3=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("Enter the first nine natural numbers");
m[i][j]=sc.nextInt();
}
}
System.out.println("The Double Dimensional Array is:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}
System.out.println("The sum of numbers in each row is:");
for(i=0;i<3;i++)
{
sum=0;
for(j=0;j<3;j++)
{
sum=sum+m[i][j];
}
System.out.println("The sum of all elements of the"+" "+(i+1)+"  row is="+sum);
}
System.out.println("The sum of nos in each column is:");
for(i=0;i<3;i++)
{
sum1=0;
for(j=0;j<3;j++)
{
sum1=sum1+m[j][i];
}
System.out.println("The sum of elements in"+" "+(i+1)+" column is="+sum1);
}
for(i=0;i<3;i++)
{
for(j=i;j<=i;j++)
{
sum2=sum2+m[i][j];
}
}
System.out.println("The sum of the elements in the left diagonal is="+sum2);
k=2;
for(i=0;i<3;i++)
{
sum3=sum3+m[i][k];
k=k-1;
}
System.out.println("The sum of all the elements in the right diagonal is="+sum3);
}
}


