import java.io.*;  
class Stack  
{  
	private char[]	aChar;
	private int[]	aInt; 
	private int topC,topI,mC,mI;  
	public Stack(int max)  
	{  
		mC=max;
		mI=max;  
		aChar=new char[mC];
		aInt=new int[mI];
		topC=-1;
		topI=-1;  
	}
	
	//two push and pop methods, the first used for converting the expression,
	//and the second used for evaluating the expression.
	public void pushC(char k)  
	{  
		aChar[++topC]=k;  
	}
	public void pushI(int k)  
	{  
		aInt[++topI]=k;  
	}
	 
	public char popC()  
	{  
		return(aChar[topC--]);  
	}
	public int popI()  
	{
		return(aInt[topI--]);
	}
	
	public char peek()  
	{  
		return(aChar[topC]);  
	}
	
	//two isEmpty() methods to check whether an array is empty or not!  
	public boolean isEmpty()  
	{  
		return (topC==-1);  
	}
	public boolean isEmptyI()  
	{  
		return (topI==-1);  
	}
	// getters methods used to track information in debugging!
	public char[] getAChar()
		{	return aChar;} 
	public int[] getAInt()
		{	return aInt;}
}  