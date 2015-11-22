import java.util.*;
class SeatSelection
{
    static Scanner sc=new Scanner(System.in);
    static Scanner sc1=new Scanner(System.in);

    public static void showSeats(int a[][],int row)//Status with the appropriate row
    {
        int c,i,j,n;
        String str;
        n=a[row].length;//Length of that row
        int l=(int)(Math.sqrt(n));
        c=0;
        for(i=0;i<l;i++)
        {
            for(int x=0;x<l;x++)
            System.out.print("------");
            System.out.print("\n");
            for(j=0;j<l;j++)
            {

                str=(a[row][c]==0)?"XX":""+(c+1);//Seat numbers are displayed
                System.out.printf(" %2s #",str);
                c++;
            }
            System.out.print("\n");
        }
        for(int x=0;x<l;x++)
        System.out.print("------");
 
    }

    public static boolean isokay(int a[][],int row,int y)
    {
        return(a[row][y]==1);
    }

    public static void chooseSeat(int a[][],int row,int y)
    {
        int i,snum,c;
        for(i=1;i<=y;i++)
        {
            c=0;
            do
            {
                c++;
                System.out.print("\f");
                System.out.print("\nHall Seating Chart\n\n");
                showSeats(a,row);
                System.out.print("\n\n");
                if(c>1)
                {
                    System.out.print("INVALID SEAT NO. !!!\n\n");
                }
                System.out.print("Enter seat no.::");
                snum=sc.nextInt();
            }while(isokay(a,row,snum-1)==false);//Checking whether the seats are available or not, if yes then booking that seat
            System.out.print("\n\n"+i+" out of "+y+" seats booked successfully\n\n");
            a[row][snum-1]=0;
            System.out.print("\n\nPress <Enter> to continue\n");
            sc1.nextLine();

        }
        System.out.print("\f");
        System.out.print("\n\nYou have successfully chosen all your seats\n");
        System.out.print("\nFinal Hall Seating Chart\n\n");
        showSeats(a,row);
    }
}