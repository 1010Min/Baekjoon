import java.util.*;
import java.io.*;

public class N_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			
			boolean prime_n = true;
			
			if(num == 1)	continue;
			
			for(int i=2; i<= Math.sqrt(num); i++) { // 소수를 구할 때 배수 거르고 제곱근 까지만 구하면 됨
				if(num % i == 0) {
					prime_n = false;
					break;
				}
			}
			if(prime_n)	count++;
		}
		
		System.out.println(count);
		
		br.close();

	}
}
