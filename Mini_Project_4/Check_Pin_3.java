package bankTxn_lambdaExp_10;

public class Check_Pin_3 {
	public boolean verify(int pinNo) {
   	 return switch(pinNo) {
   	 case 1111 : yield true;
   	 case 2222 : yield true;
   	 case 3333 : yield true;
   	 default : yield false;
   	 };
    }
}
