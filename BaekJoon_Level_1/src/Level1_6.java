import java.util.*;

public class Level1_6 {	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();		
		sc.close();
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.print(A % B);
	}
}