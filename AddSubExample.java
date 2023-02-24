package innerpack;
import java.util.Scanner;
public class AddSubExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("+-add \n - sub");
		int num1,num2;
		char option;
		System.out.println("Enter + or -");
		Scanner scanner=new Scanner(System.in);
		option=scanner.next().charAt(0);
		switch(option)
		{
		case '+':
			System.out.println("Enter the num1,num2");
			num1=scanner.nextInt();
			num2=scanner.nextInt();
			System.out.println("the addition result-->"+(num1+num2));
		break;
		case '-':System.out.println("Enter the num1,num2");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("the sub result is-->"+(num1-num2));
		break;
		default: System.out.println("Enter a valid option 1 or 2 only");
		break;
		
	
		}
		
		System.out.println("end of main");
		
	}

}
