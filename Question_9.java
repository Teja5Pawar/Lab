/*
Q9.  Write a program that accept string as command line  argument and  generate the  output
		in specific way  Example if two command line argument are wipro and bangolre then the
		ouput  generated  should be  wipro technology  banglore . If  the argument  are ABC and 
		Mumbai then output should be ABC technology mumbai
*/

package Core_Java_Lab_Work;

public class Question_9 {
	
	void GetOutput(String a, String b)
	{
		String str1 = a;
		String str2 = b;
		String n ="Technology";
		System.out.println(str1+" "+n+" "+str2);
	}
	
	public static void main(String[] args) {
		String str1,str2;
		Question_9 Q = new Question_9();
		str1 = args[0];
		str2 = args[1];
		
		Q.GetOutput(str1,str2);
	}

}
