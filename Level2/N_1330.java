import java.util.*;

public class N_1330 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b)		System.out.println(">");
		if(a<b)		System.out.println("<");
		if(a==b)	System.out.println("==");
	}

}
