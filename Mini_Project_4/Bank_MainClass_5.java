package bankTxn_lambdaExp_10;
import java.util.*;
public class Bank_MainClass_5{
		public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       int count=0;
	       xyz:
	       while(true)
	       {
	    	   System.out.println("Enter the pinNo:");
	    	   int pinNo = s.nextInt();
	    	   Pin_Num_Length_4 pnl = new Pin_Num_Length_4();
	    	   int len = pnl.length(pinNo);
	    	   if(len==4) {
	    		   Check_Pin_3 cpn = new Check_Pin_3();
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
	    					  //LambdaExpression
	    					  Txn_Interface_2 wd = (int amt)->
	    					      {
	    							   if(amt<=Txn_Interface_2.b.bal) {
	    								  System.out.println("Amt WithDrawn:"+amt);
	    								  Txn_Interface_2.b.bal=Txn_Interface_2.b.bal-amt;
	    								  System.out.println("Balance amt:"+Txn_Interface_2.b.getBalance());
	    								  System.out.println("Transaction Completed...");
	    							   }else {
	    								   System.out.println("Insufficient fund...");
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
	    				  if(a2>0 && a2%100==0) { 
	    					  //LambdaExpression
	    					  Txn_Interface_2 dp = (int amt)->
	    					  {
	    						    	 System.out.println("Amt deposited:"+amt);
	    						    	 Txn_Interface_2.b.bal=Txn_Interface_2.b.bal+amt;
	    						    	 System.out.println("Balance Amt:"+Txn_Interface_2.b.getBalance());
	    						    	 System.out.println("Transaction Completed...");
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
	    		 System.out.println("Sorry ! Transaction blocked");
	    		 break;//stop the loop
	    	   }
	       }//end of loop
	}

}
