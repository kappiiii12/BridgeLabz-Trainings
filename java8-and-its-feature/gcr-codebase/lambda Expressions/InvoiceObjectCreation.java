//package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Invoice{
	private String id ;
	public Invoice(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Invoice [ ID ="+id+" ]" ; 
	}
}
public class InvoiceObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> transactionId = Arrays.asList("123","236","432","654","786","675");
        
        List<Invoice> invoiceList = transactionId.stream()
        		                                .map((x) -> new Invoice(x) )
        		                                .collect(Collectors.toList());
        
        for(Invoice x : invoiceList)
        	System.out.println(x.toString());
	}

}
