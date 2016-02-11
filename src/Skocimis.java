import java.util.Scanner;
public class Skocimis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("Enter Number : ");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			num3 = scan.nextInt();
			
			if(num1 <= 0 || num1 >= 100){
				System.out.println("Please enter again");
			}else if(num2 <= 0 || num2 >= 100){
				System.out.println("Please enter again");
			}else if(num2 <= 0 || num2 >= 100){
				System.out.println("Please enter again");
			}else if(num3 <= 0 || num3 >= 100){
				System.out.println("Please enter again");
			}else if(num2 <= num1){
				System.out.println("Number2 must more than Number1. Please enter again");
			}else if(num3 <= num2){
				System.out.println("Number3 must more than Number2. Please enter again");
			}
			
		}while(num1 <= 0 || num1 >= 100 || num2 <= 0 || num2 >= 100 || num3 <= 0 || num3 >= 100 || num3 < num1 || num3 < num2 || num2 < num1
				|| num1 > num2 || num1 > num3);
	System.out.println("");
	System.out.println(((num3-num2)-1)+ " time.");
	}

}
