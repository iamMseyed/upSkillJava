package bankTxn_anymsInnerClass_Imple_9;
import java.util.*;
public class Bank_MainClass_5 {
		public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       int count=0;
	       xyz:
	       while(true)
	       {
	    	   System.out.println("Enter the pinNo:");
	    	   int pinNo = s.nextInt();
	    	   PinNoLength_4 pnl = new PinNoLength_4();
	    	   int len = pnl.length(pinNo);
	    	   if(len==4) {
	    		   Check_PinNo_3 cpn = new Check_PinNo_3();
	    		   boolean k = cpn.verify(pinNo);
	    		   if(k) {
	    			  System.out.println("===Choice===");
	    			  System.out.println("1.WithDraw\n2.Deposit");
	    			  System.out.println("Enter the Choice:");
	    			  switch(s.nextInt()) {
	    			  case 1:
	    				  System.out.println("Enter the amt:");
	    				  int a1 = s.nextInt();
	    				  if(a1>=0 && a1%100==0) {
	    					  //Anonymous InnerClass as implementation class
	    					  Transaction_Interface_2 wd = new Transaction_Interface_2()
	    					  {
	    						   public void process(int amt) {
	    							   if(amt<=b.bal) {
	    								  System.out.println("Amt WithDrawn:"+amt);
	    								  b.bal=b.bal-amt;
	    								  System.out.println("Balance amt:"+b.getBalance());
	    								  System.out.println("Transaction Completed...");
	    							   }else {
	    								   System.out.println("Insufficient fund...");
	    							   }
	    						   }
	    						};
	    					  wd.process(a1);
	    				  }else {
	    					  System.out.println("Invalid amt");
	    				  }
	    				  break xyz;//stop loop
	    			  case 2:
	    				  System.out.println("Enter the amt:");
	    				  int a2 = s.nextInt();
	    				  if(a2>0 && a2%100==0){ 
	    				//	Anonymous InnerClass as implementation class
	    					  Transaction_Interface_2 dp = new Transaction_Interface_2()
	    					  {
	    						         public void process(int amt) {
	    						    	 System.out.println("Amt deposited:"+amt);
	    						    	 b.bal=b.bal+amt;
	    						    	 System.out.println("Balance Amt:"+b.getBalance());
	    						    	 System.out.println("Transaction Completed...");
	    						     }
	    						};
	    					  dp.process(a2);
	    				  }else {
	    					  System.out.println("Invalid amt...");
	    				  }
	    				  break xyz;
	    			  default:
	    				  System.out.println("Invalid Choice...");
	    				  break xyz;
	    			  }//end of switch
	    		   }else {
	    			   System.out.println("InCorrect pinNo...");
	    			   count++;
	    		   }
	    	   }else {
	    		   System.out.println("Invalid pinNo...");
	    		   count++;
	    	   }
	    	   if(count==3)
	    	   {
	    		 System.out.println("Sorry! Transaction blocked");
	    		 break;//stop the loop
	    	   }
	       }//end of loop
		}
}
