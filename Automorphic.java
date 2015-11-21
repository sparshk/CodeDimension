import java.util.*;
class Automorphic
{
    int count(int n)
    {
        int ctr=0;
        while(n>0)
        {
            n=n/10;
            ctr++;
        }
        return ctr;
    }
    void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sq = num*num;
        int x = count(num);
        if(sq%Math.pow(10,x)==num)
        System.out.println("Automorphic number");
        else
        System.out.println("Not an automorphic number");
    }
}