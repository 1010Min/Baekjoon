import java.util.Scanner;

public class N_2739 {
	public static void main(String[] args) {
		int a;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		for(int i=1; i<10; i++)
			System.out.println(a + " * " + i + " = " + a*i);
	}
}
