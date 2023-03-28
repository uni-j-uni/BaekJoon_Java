// 1998년생인 내가 태국에서는 2541년생?!
import java.util.Scanner;

public class Level1_8 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int bulgi_year = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", bulgi_year - 543);
	}
}