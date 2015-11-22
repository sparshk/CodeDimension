class overload
{
double area(double b,double h)
{
double pg=b*h;
return pg;
}
double area(int d1,int d2)
{
double rh=0.5*d1*d2;
return rh;
}
double area(double a, double b, double h)
{
double tr=0.5*(a+b)*h;
return tr;
}
void main()
{
overload ar=new overload();
ar.area(2.5,6,8);
ar.area(5,6);
ar.area(2.0,6.0,7.0);
}
}
