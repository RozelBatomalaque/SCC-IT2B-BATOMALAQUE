package javabatomalaque;
import java.util.Scanner;


public class ReceiptClass {
    
     public void getReceipt(){
          Scanner  input = new Scanner(System.in);
    
        String cname, prodname;
        int qty, price, cash;
        
        System.out.print("Customer Name: ");   
        cname = input.nextLine();
        System.out.print("Product Name: "); 
        prodname = input.nextLine();
        System.out.print("Quantity: ");
        qty = input.nextInt();
        System.out.print("Price: ");
        price = input.nextInt();
        System.out.print("Cash: ");
        cash = input.nextInt();
        
        
        System.out.println("\n---------------------------------");
        System.out.println("RECEIPT");
        System.out.println("-----------------------------------");
        
        
        System.out.println("Customer Name: "+cname);
        System.out.println("Product Name: "+prodname);
        System.out.println("Quantity: "+qty);
        System.out.println("------------------------------------");
        System.out.println("Total Due: "+ (qty*price));
        System.out.println("Cash: "+(cash));
        System.out.println("Change: "+(cash-(qty*price)));
        System.out.println("------------------------------------");
        
        
        
        
}
        

  
}
    
    
