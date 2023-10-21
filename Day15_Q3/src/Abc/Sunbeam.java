package Abc;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class Sunbeam 
{

	public static void main(String[] args)
	{
		try(FileWriter fw = new FileWriter("Output.txt"))
		{
		 try(BufferedWriter bw = new BufferedWriter(fw))
		 {
			 for (int i=0;i<4;i++)
			 {
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter line");
				 String line = sc.next();
				 bw.write(line);
				 bw.newLine();
			 }
	     }

        }
		catch(Exception e)	
		{
			e.printStackTrace();
		}
	
	
}
}


