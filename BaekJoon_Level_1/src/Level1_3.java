import java.util.Scanner;

public class Level1_3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		System.out.print(A - B);
	}
}