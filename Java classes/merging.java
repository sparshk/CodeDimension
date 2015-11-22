import java.util.*;
class merging
{
void main()
{
Scanner sc=new Scanner(System.in);
int i;
int a[]=new int[4];
int b[]=new int[4];
for(i=0;i<4;i++)
{
System.out.print("\nEnter the"+" "+(i+1)+" "+"element in the first array:");
a[i]=sc.nextInt();
System.out.print("\nEnter the"+" "+(i+1)+" "+"element in the second array:");
b[i]=sc.nextInt();
}
int k=4;
int c[]=new int[8];
for(i=0;i<8;i++)
{
if(i>=4)
c[i]=b[i-k];
else
c[i]=a[i];
}
System.out.println();
System.out.println();
System.out.println();
System.out.println("The merged array");
for(i=0;i<8;i++)
System.out.print(c[i]+" ");
}
}


