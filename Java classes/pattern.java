
class pattern
{
void main(int n)
{
int sum=0;
int s=1;
int p=1;
for(int i=2;i<=n;i++)
{
s=s+i;
p=p*1;
sum=sum+(s/p);
}
System.out.println("The sum of the series is="+sum);
}
}