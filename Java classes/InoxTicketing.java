import java.util.*;
class InoxTicketing
{
    static Scanner sc=new Scanner(System.in);
    static Scanner sc1=new Scanner(System.in);

    static int hall[][]={
                        {16,3},
                        {9,3},
                        {16,7},
                        {16,10}
                        };//The !st coloumn indicates the no.s of seats and the 2nd coloumn indicates the no.s of seats booked.
    static int status[][]={
                          {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},
                          {1,1,1,0,1,0,1,0,1},
                          {1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0},
                          {0,0,0,0,0,0,0,1,1,0,0,1,1,1,1,0}
                          };//0 for the booked and 1 for the availables
  
    static String movies[]={"MISSION IMPOSSIBLE (ENGLISH)","ROYAL BENGAL RAHASYA (BENGALI)","ADVENTURES OF TINTIN (ENGLISH)","DON 2 (HINDI)"};
    static int rate[]={100,150,225};
    static String type[]={"Standard","Deluxe","Luxury"};
    public static void mainMenu()
    {    
        int i,x;
        int choice;
        Date d=new Date();
        while(true)
        {
            System.out.print("\f");
            System.out.print("                          "+d.toString()+"\n");
            System.out.print("********************************************************************************\n");
            System.out.print("********************************************************************************\n");
            System.out.print("*************************(INOX CITY CENTRE)*************************************\n");
            System.out.print("********************************************************************************\n");
            System.out.print("********************************************************************************\n");
            System.out.print("Type 1 for Movie Details\n");
            System.out.print("Type 2 for Ticket Booking\n");
            System.out.print("Type 3 to Order Snacks\n");
            System.out.print("Type 4 to Quit\n");
            System.out.print("Enter choice (1/2/3/4)::");
            choice=sc.nextInt();
            System.out.print("\n\n");
            if(choice==4)
            {
                System.out.print("Exiting Main Menu , Please Wait");
                try
                {
                    Thread.sleep(3000);//Used for a better get-up in the program
                }
                catch(Exception e)
                {}
                break;
            }
            else if (choice==1)
            {
                displayInfo();
            }
            else if (choice==2)
            {
                booking();
            }
            else if (choice==3)
            {
                orderFood();
            }
            else
            {
                System.out.print("Wrong Choice !");
            }
            System.out.print("\n\nPress <Enter> to return to Main Menu");
            sc1.nextLine();
        } 
        System.out.print("\f");
        System.out.print("Program Terminated.");
    }
    public static void orderFood()
    {    
        String items[]={"Veg. Sandwich","Chicken Sandwich","Veg Burger","Chicken Burger","French Fries","Popcorn","Samosa","Pepsi","Coffee"};
        int price[]={25,40,32,55,35,25,8,18,30};
        int codeordered[]=new int[10];//These are the 2 arrays to store the ite and its price
        int qtyordered[]=new int[10];
        int count,code,qty,choice;
        String suffix;
        count=0;//It is the cell of the arrays
        do
        {
            do
            {
                displaySnacksMenu(items,price);
                System.out.print("Enter Item Code (1-9)::");
                code=sc.nextInt();//code of the item to be orderd
            }while (code<1||code>9);
            suffix=(code<3)?"es":code==5?"":"s";
            System.out.print("How many "+items[code-1]+suffix+" ? ");
            qty=sc.nextInt();
            codeordered[count]=code-1;
            qtyordered[count]=qty;
            count++;//After choosing an item in 1 cell, the next item will be stored in the next cell
            do
            {
                System.out.print("Type 0 if you've finished ordering/type 1 for more items\n");
                System.out.print("Enter choice (0/1) ? ");
                choice=sc.nextInt();
            }while(choice<0|| choice>1);
        }
        while(choice==1);
        System.out.print("\f");
        System.out.print("####################################################################\n");
        System.out.print("============================(Your Bill)===========================\n");
        System.out.print("####################################################################\n");
        System.out.print("I T E M     N A M E     Qty.  PRICE   TOTAL\n");
        System.out.print("##################################################################\n");
        String str;
        int x1,x2,i,tot,grandtot;
        grandtot=0;
        for(i=0;i<count;i++)//Item code for progmammer is always 1 less than user's choice
        {
            x1=codeordered[i];
            str=items[x1];//The detail of the item in ith position
            qty=qtyordered[i];
            x2=price[x1];
            tot=qty*x2;
            grandtot+=tot;
            System.out.printf("%20s    %2d      %3d   %3d\n",str,qty,x2,tot);//Alloting proper spaces for better allignment
        }
        System.out.print("##################################################################\n");
        System.out.printf("                         Bill Amt. Rs %3d\n",grandtot);
        System.out.print("##################################################################\n");
        System.out.print("\n\n");
        System.out.print("Thank You for using our Snacks Corner\n\n");
        System.out.print("Enjoy your Movie\n");
    }
    public static void displaySnacksMenu(String items[],int price[])//The required parameters are passed
    {    
        int i;
        System.out.print("\f");
        Date d=new Date();
        System.out.print("                          "+d.toString()+"\n");
        System.out.print("================================================================================\n");
        System.out.print("============================(INOX SNACKS CORNER )===============================\n");
        System.out.print("================================================================================\n");
        System.out.print("#################################################################################\n");
        System.out.print("ITEM CODE    I T E M  N A M E       PRICE\n");            
        System.out.print("=========================================================================\n");

        for(i=0;i<9;i++)
        {    
            System.out.printf("%5d   %20s     %8d\n",(i+1),items[i],price[i]);
            System.out.print("==========================================================================\n");
        }
        System.out.println("**The prices are inclusive of all taxes**");
    }
    
    public static void displayInfo()
    {    
        int i,x;
        System.out.print("\f");
        Date d=new Date();
        System.out.print("                          "+d.toString()+"\n");
        System.out.print("================================================================================\n");
        System.out.print("==================(INOX CITY CENTRE INFORMATION KIOSK)==========================\n");
        System.out.print("================================================================================\n");
        System.out.print("#################################################################################\n");
        for(i=0;i<4;i++)
        {
            x=hall[i][0]-hall[i][1];//i is the row and 0 and 1 are the 1st and the 2nd coloumn of i
                        //Their difference gives the number of seats available
            System.out.print("Hall "+(i+1)+" is screening "+movies[i]+"  ");
            if(x>0)
            {
                System.out.print("["+x+" tickets available]\n");
            }
            else
            {
                System.out.print("[House Full !]\n");
            }
            System.out.print("#################################################################################\n");
        }
        System.out.print("\nShow Timings ::[12 P.M.]  [3 P.M.]    [6 P.M.]   [8.30 P.M.]\n");
        System.out.print("Movie Rates\n");
        System.out.print("===========\n");
        for(i=0;i<3;i++)
        {
            System.out.print(type[i]+" seats : "+"Rs."+rate[i]+"\n");//Type is the category of seats with different prices
        }
    }
    public static void booking()
    {    
        int hallno,x,y,num,c;
        num=0;
        do
        {
            System.out.print("\f");//Clears the screen
            System.out.print("Enter the Hall number (1/2/3/4)::");
            hallno=sc.nextInt();
        }while (hallno<1 || hallno>4);
        x=hallno-1;
        y=hall[x][0]-hall[x][1];
        System.out.print("\nYou have chosen Hall number "+hallno+" which is screening "+movies[x]);
        System.out.print("\n\nThere are "+y+" tickets available for this movie\n");
        System.out.print("\n\n");
        if(y==0)
        {
            System.out.print("Sorry ! House Full ! You may choose some other movie.\n\n");
            return;
        }
        c=0;
        do
        {
            c++;
            if(c>1)
            {
                if(num<1)
                {
                    System.out.print("\nOops ! Invalid entry !\n");
                }
                else
                {
                    System.out.print("\nOops ! Only "+y+" seats available !\n");
                }
            }
            System.out.print("\nEnter the number of tickets to book::");
            num=sc.nextInt();
        }while (num<1 || num>y);
        hall[x][1]+=num;//The changes in the number of booked seats are made
        System.out.print("\n\n");
        int s;//Type of seat
        for(int i=0;i<3;i++)
        {
            System.out.print(type[i]+" seats cost Rs. "+rate[i]+"\n");
        }
        do
        {
            System.out.print("\nChoose Seat Category (1/2/3)::");
            s=sc.nextInt();
        }while (s<1 || s>3);
        s--;
        int tot;
        System.out.print("\n\nYou have booked "+num+" tickets and have chosen "+type[s]+" Seats priced at Rs. "+rate[s]+" each\n");
        tot=num*rate[s];
        System.out.print("Kindly Pay Rs. "+tot+" to Confirm Booking\n");
        System.out.print("\n\nPress <Enter> after Payment\n");
        sc1.nextLine();
        System.out.print("Thank You , Your Booking Is Confirmed\n ");
        System.out.print("\n\nPress <Enter> to choose your Seat\n");
        sc1.nextLine();
        SeatSelection.chooseSeat(status,x,num);
    }
}