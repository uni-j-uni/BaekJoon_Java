// 곱셈
import java.util.*;

public class Level1_10 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.println(num1 * (num2 % 10));
		System.out.println(num1 * ((num2 / 10) % 10));
		System.out.println(num1 * (num2 / 100));
		System.out.print(num1 * num2);
	}
}