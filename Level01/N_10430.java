//ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
import java.util.Scanner;

public class N_10430 {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}
