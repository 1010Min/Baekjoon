import java.util.*;

public class N_2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int k=0; k<N; k++) {
		
			int n = sc.nextInt();
			String input = sc.next();
			
			for(int j=0; j<input.length(); j++) {
				for(int i=0; i<n; i++) 
					System.out.print(input.charAt(j));	
			}
			System.out.println();
		}
	}
}
