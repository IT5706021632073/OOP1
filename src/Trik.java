import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		int p = 1;
		char abc[] = new char[100];
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Data : ");
		abc=scan.next().toCharArray();
		
		for (int i = 0 ; i < abc.length ; i++) {
			if (abc[i]=='A') {
				if (p==1) { p=2; }
				else if (p==2) { p=1;}
			}
			else if (abc[i]=='B') {
				if (p==2) { p=3; }
				else if (p==3) { p=2;}
			}
			else if (abc[i]=='C') {
				if (p==3) { p=1; }
				else if (p==1) { p=3;}
			}
		}
		System.out.print("Show Data : " + p);
	}
}