public class paymentFactory{
  
     public Transaction getPayment(String paymentType){
      if(paymentType == null){
         return null;
      }
      if(paymentType.equalsIgnoreCase("phonepe")){
         return new PhonePe();
         
      } else if(paymentType.equalsIgnoreCase("paytm"))
         return new Paytm();
	return null;
     
   
 
     
   }
  
}
