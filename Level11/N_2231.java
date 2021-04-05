import java.io.*;

public class N_2231 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 0;
		
		for(int i=0; i<N; i++) {
			int number = i;
			int sum = 0; // 각 자릿수 합
			
			while(number != 0) {
				sum += number % 10; // 각 자리수 더하기
				number /= 10;
			}
			
			if(sum + i == N) {
				num = i;
				break;
			}
		}
		System.out.println(num);
		
		br.close();
	}
}
