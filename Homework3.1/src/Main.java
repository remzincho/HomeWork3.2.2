
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter N:");
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		in.close();


	}

}
