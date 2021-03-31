import java.io.*;
import java.util.*;

public class N_9020 {
	public static boolean check_prime[] = new boolean[10001]; 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			
			int first = n/2;
			int second = n/2;
			
			prime();
			
			while(true) {
				if(!check_prime[first] && !check_prime[second]) {
					System.out.println(first + " " + second);
					break;
				}
				first--;
				second++;
			}
			
		}
		br.close();
	}
	
	public static void prime() {
		check_prime[0] = true; // 0은 소수가 아니므로
		check_prime[1] = true; // 1은 소수가 아니므로
		
		for(int i=2; i <= Math.sqrt(check_prime.length); i++) {
			if(check_prime[i]) continue;
			
			for(int j=i*i; j<check_prime.length; j += i) {
				check_prime[j] = true;
			}
		}
	}
	
}
