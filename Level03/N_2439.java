import java.util.Scanner;

public class N_2439 {
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int j=1; j<=n; j++) {
				if(j>=i)	System.out.print("*");
				else	System.out.print(" ");
			}
			System.out.println();
		}
	}
}