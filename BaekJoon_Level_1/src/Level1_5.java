// A / B
import java.util.Scanner;

public class Level1_5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextInt();
		double B = sc.nextInt();		
		sc.close();
		
		System.out.print(A / B);
	}
}