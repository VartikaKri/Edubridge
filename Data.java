package innerpack;

import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=80000;

		String phone="7909064114";

		long phoneNumber=Long.parseLong(phone);

		String address="h/3 central hospital colony dhori"; 
		Scanner name=new Scanner(System.in); 
		System.out.println("Enter your mother name: ");
		String father=name.nextLine();

		//mother =next().Scanner
		 
		Scanner f_name =new Scanner(System.in); 
		System.out.println("Enter your father name: "); 
		String mother=f_name.nextLine();
		System.out.println("Father name: "+father+"\n"+"Mother name:"+mother); 
		System.out.println("Salary of my Parents: "+salary); 
		System.out.println("Father Phone-Number: "+ phoneNumber); 
		System.out.println("Address: "+address);
	}

}
	
