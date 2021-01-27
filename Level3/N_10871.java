import java.util.*;

public class N_10871 {
	public static void main(String[] args) {
		int n, x;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextInt();
		
		int[] A = new int[n];
		
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
			if(A[i] < x)
				System.out.print(A[i] + " ");
		}
	}
}