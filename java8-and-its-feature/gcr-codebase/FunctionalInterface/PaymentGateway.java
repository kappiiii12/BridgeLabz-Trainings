import java.util.*;

 interface Payment {
    void pay();
}
class UPI implements Payment {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payment Done Via UPI");
	}

}
class Wallet implements Payment {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
        System.out.println("Payment Done Via Wallet");
	}

}
class CreditCard implements 	Payment{
        @Override
        public void pay() {
        	System.out.println("Payment Done Via Credit Card");
        }
}
public class PaymentGateway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Payment> list = new ArrayList<>(Arrays.asList(new UPI(),new Wallet(),new CreditCard()));
        for(Payment x :list) {
        	x.pay();
        }
	}

}
