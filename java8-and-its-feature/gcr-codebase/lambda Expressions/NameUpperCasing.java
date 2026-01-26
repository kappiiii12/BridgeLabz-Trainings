//package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class NameUpperCasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<String> employees = new ArrayList<>(Arrays.asList("kapil","ankit","aryan","somya","nikhil","pavan"));
          
          List<String> res = employees.stream()
        		                      .map( (x) -> x.toUpperCase())
        		                      .collect(Collectors.toList());
        		                      
          System.out.println(res);
	}

}
