import java.util.Arrays;

//class Eval converts an expression from infix to postfix
public class Eval
{  
	private Stack s;  
	private String input;  
	private String output="";  

	//the constructor takes a string in infix
	public Eval(String str)  
	{  
		input=str;  
		s=new Stack(str.length());  
	}
	public String getOutput()
	{
		return output;
	}
	
	//converts an infix expression to a postfix using
	//methods operator(char opThis,int prec1,char x) and
	//parenthesis(char x)
	public String inToPost()  
	{  
	     for(int i=0;i<input.length();i++)  
		{  
			char ch=input.charAt(i);  
			switch(ch)  
			{  
			case '+':  
			case '-':operator(ch,1,'(');  
				break;  
			case '*':  
			case '/':operator(ch,2,'(');  
				break;  
			case '(':s.pushC(ch);  
				break;  
			case ')':parenthesis('(');  
				break;  
			default:output=output+ch;  
			}
		}  
		while(!s.isEmpty())  
			output=output+s.popC();  
		return output;  
	}
	
	public void operator(char opThis,int prec1,char x)  
	{  
		while(!s.isEmpty())  
		{  
			char opTop=s.popC();  
			if(opTop==x)  
			{  
				s.pushC(opTop);  
				break;  
			}  
			else  
			{  
				int prec2;  
				if(opTop=='+'||opTop=='-')  
				prec2=1;  
				else  
				prec2=2;  
				if(prec2<prec1&&x=='(')  
				{  
					s.pushC(opTop);  
					break;  
				}
				else if(prec2<=prec1&&x==')')  
				{
					s.pushC(opTop);  
					break;  
				}
				else  
				{
		           if(x==')')  
		             output=opTop+output;  
		           else  
		             output=output+opTop;  
				}
			}
		}
		s.pushC(opThis);  
	}
	public void parenthesis(char x)  
	{  
		while(!s.isEmpty())  
		{  
			char ch=s.popC();  
			if(ch==x)  
			break;  
			else  
			{  
				if(x==')')  
					output=ch+output;  
				else  
					output=output+ch;  
			}
		}
	}
}