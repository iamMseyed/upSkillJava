package bankTxn_lambdaExp_10;

public class Pin_Num_Length_4 {
	  public int c=0;
      public int length(int pinNo)
      {
    	  while(pinNo>0)
    	  {
    		  c++;
    		  pinNo = pinNo/10;
    	  }//end of loop
    	  return c;
      }
}
