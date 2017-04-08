import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Test  
{  
   public static void main(String args[])throws IOException
   {  
		String s,check="c";  
		Eval inf;
		Evaluate e;

		while(check.equals("c"))
		{  	
			System.out.println("Enter the infix expression ");
			Scanner scanner = new Scanner(System.in);
			String exp = scanner.nextLine();
			inf=new Eval(exp);
			System.out.println("Postfix expression: "+inf.inToPost());
			e=new Evaluate();
			System.out.println("Result: "+e.calculate(inf.inToPost()));
			System.out.println("-----------------------------");
			System.out.println("Press c to continue");  
			check=scanner.nextLine();
			System.out.println("-----------------------------");
		}  
		
	} 
}  