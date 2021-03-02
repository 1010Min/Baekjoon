import java.io.*;

public class N_2581 {
	public static boolean check_prime[]; // 소수 체크할 배열 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum=0; 
		int min = Integer.MAX_VALUE;
		
		check_prime = new boolean[N+1]; 
		
		prime();
		
		for(int i=M; i<=N; i++) {
			if(!check_prime[i]) {
				sum += i;
				if(min == Integer.MAX_VALUE) // 첫 소수가 최소 소수값이므로 처음 값으로 지정
					min = i;
			}
		}
		
		if(sum == 0)	System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		br.close();
		
	}
	
// 에라토스테네스의 체 방식 -> 대부분 소수 문제에 적용 가능	
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
