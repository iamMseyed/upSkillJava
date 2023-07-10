package bankTxn_anymsInnerClass_Imple_9;

public class Check_PinNo_3 {
    public boolean verify(int pinNo) {
   	 return switch(pinNo) {
   	 case 1111 : yield true;
   	 case 2222 : yield true;
   	 case 3333 : yield true;
   	 default : yield false;
   	 };
    }
}

