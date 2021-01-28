import java.util.Scanner;

public class N_10950 {
	public static void main(String[] args) {
		int a,x,y;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		for(int i=a; i>0; i--) {
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println(x+y);
		}
	}
} 
