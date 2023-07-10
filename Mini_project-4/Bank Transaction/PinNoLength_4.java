package bankTxn_anymsInnerClass_Imple_9;

public class PinNoLength_4 {
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
