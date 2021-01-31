import java.util.Scanner;

public class N_2884 {
	public static void main(String[] args) {
		int h, m;
		
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(m>=45)
			System.out.println(h + " " + (m-45));
		
		else {
			if(h>=1)
				System.out.println((h-1) + " " + (m+60-45));
			else
				System.out.println((h+24-1) + " " + (m+60-45));
		}
	}
}
