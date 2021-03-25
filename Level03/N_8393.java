import java.util.Scanner;

public class N_8393 {
	public static void main(String[] args) {
		int n, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			sum += i;
		}
		System.out.println(sum);
	}
}