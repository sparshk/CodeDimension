import java.util.*;
class slanting
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string without any space between.");
        String str=sc.nextLine();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<=i;j++)
            {
                System.out.println(str.charAt(j));
            }
        }
    }
}