//package csvFlies;

import java.io.FileWriter;
import java.io.IOException;

public class CsvFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        String csvFileName = System.getProperty("user.dir") + "//data//example.csv" ;
        FileWriter writer = new FileWriter(csvFileName);
        
        writer.append("name,age,email\n");
        writer.append("kapil,21,kapil@gmail.com\n");
        writer.append("ankit,19,abc@gmail.com\n");
        writer.append("aish,28,xyz@gmail.com\n");
        writer.append("muski,21,love@gmail.com\n");
        writer.close();
        
        System.out.println("CSV Flie Created at : "+csvFileName);
	}

}
