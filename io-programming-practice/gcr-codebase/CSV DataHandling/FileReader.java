//package csvFlies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
   File file = new File(System.getProperty("user.dir")+"//data//example.csv");
    Scanner sc = new Scanner(file);
    sc.useDelimiter(",");
    while(sc.hasNext()) {
    	System.out.println(sc.next()+"\t");
    }
    sc.close();
	}

}
