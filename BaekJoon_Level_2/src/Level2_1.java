// 두 수 비교하기
import java.util.*;

public class Level2_1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if (A > B)
			System.out.print(">");
		else if (A < B)
			System.out.print("<");
		else
			System.out.print("==");
	}
}
