import java.io.*;  
import java.util.Arrays;

// class Evaluate evaluates a postfix expression using method calulate(String s)
public class Evaluate{
	// calculate(String s) returns the resulte of evaluating an expression
	public int calculate(String s)  
	{  
		int n,r=0;  
		n=s.length(); 
		Stack a=new Stack(n);  
		for(int i=0;i<n;i++)  
		{  
			char ch=s.charAt(i);  
			if(ch>='0'&&ch<='9')  
			a.pushI((int)(ch-'0'));  
			else  
			{  
				int x=a.popI();  
				int y=a.popI();  
				switch(ch)  
             	{  
					case '+':r=x+y;  
						break;  
					case '-':r=y-x;  
						break;  
					case '*':r=x*y;  
						break;  
					case '/':r=y/x;  
						break;  
					default:r=0;  
				}  
				a.pushI(r);  
			}
		}  
		r=a.popI();
		return(r);  
	}  
}