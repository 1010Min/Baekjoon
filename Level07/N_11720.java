import java.util.*;

public class N_11720 {

	public static void main(String[] args) {
		int n, sum = 0;
		String input;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		input = sc.next();
		
		for(int i=0; i<n; i++) {
			sum += input.charAt(i) - '0'; // char을 int형으로 변환
		}
		System.out.println(sum);
	}
}
