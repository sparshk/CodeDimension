import java.util.*;
class CricketKit
{
    String Itemname;
    double price;
    int quantity;
    double saleprice;
    double netprice;
    double discount;
    CricketKit()
    {
        Itemname="";
        price=0.0;
        quantity=0;
        saleprice=0.0;
        netprice=0.0;
        discount=0.0;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Item name=");
        Itemname=sc.nextLine();
        System.out.println("Enter the price of the Item:");
        price=sc.nextDouble();
        System.out.println("Enter the quantity supplied:");
        quantity=sc.nextInt();
    }

    double discount()
    {
       
        saleprice=price*quantity;
        if(saleprice>=15000)
            discount=0.10*saleprice;
        else if(saleprice>=5000&&saleprice<15000)
            discount=0.05*saleprice;
        else if(saleprice<5000)
            discount=0.0;
        return discount;
}

    double calculate()
    {
        netprice=saleprice-discount;
        return netprice;
   }

    void display()
    {
        System.out.println("Item name"+"\t"+"Unit price"+"\t"+"Quantity"+"\t"+"Sale Price"+"\t"+"Discount"+"\t"+"Net Price");
        System.out.println(Itemname+"\t"+price+"\t"+quantity+"\t"+saleprice+"\t"+discount+"\t"+netprice+"\t");
    }
}

   
