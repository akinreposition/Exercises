import java.util.Scanner;
public class ExecptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayLength = 2;
		int[] firstNumber = new int[arrayLength];
		int[] secondNumber = new int[arrayLength];
		char[] operator = new char[arrayLength];
		int[] result = new int[arrayLength];
		
		Scanner collect = new Scanner(System.in);
		
	
		for(int counter =0;counter<result.length;counter++ )
		{
		System.out.println("Input first number: ");
		firstNumber[counter] = collect.nextInt();
		
		System.out.println("Input second number: ");
		secondNumber[counter] = collect.nextInt();
		
		System.out.println("Input Operator character: ");
		operator[counter] = collect.next().charAt(0);}
	
		
		try {
			for(int counter =0;counter<result.length;counter++ )
					
		switch(operator[counter]) {
		case '+':
			result[counter]= firstNumber[counter] + secondNumber[counter];
		break;
		case '-':
			result[counter]= firstNumber[counter] - secondNumber[counter];
		break;
		case '*':
			result[counter]= firstNumber[counter] * secondNumber[counter];
		break;
		case '/':
			result[counter]= firstNumber[counter] / secondNumber[counter];
		break;
		case '%':
			result[counter]= firstNumber[counter] % secondNumber[counter];
		break;
		case '^':
			result[counter] = (int) Math.pow(firstNumber[counter], secondNumber[counter]);
			result[counter]= firstNumber[counter] ^ secondNumber[counter];
		break;
		}
		}
		catch(Exception error) {
			
		}
		
		System.out.printf("%4s %12s %12s %10s%n", "First Number", "Operator", "Second Number","Result");
		for(int counter=0; counter<result.length; counter++)
		System.out.printf("%4d %15s %10d %15d%n", firstNumber[counter], operator[counter], secondNumber[counter],result[counter]);
		
	}

}
