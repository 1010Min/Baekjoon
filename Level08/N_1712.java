import java.util.*;

public class N_1712 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result;
		
		if(c <= b)
			result = -1;
		else
			result = a / (c-b) + 1;
		
		System.out.println(result);
	}

}
