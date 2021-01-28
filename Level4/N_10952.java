import java.util.Scanner;

public class N_10952 {
	public static void main(String[] args) {
		int a=1,b=1;
		
		Scanner sc = new Scanner(System.in);
		
		while(a!=0 && b!=0){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a!=0 && b!=0)
				System.out.println(a+b); 
		}
	}
}
