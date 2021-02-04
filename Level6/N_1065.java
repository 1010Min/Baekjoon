import java.io.*;

public class N_1065 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(count(Integer.parseInt(br.readLine())));
	}
	
	public static int count(int num) {
		int count = 0;
		
		if(num<100)
			return num;
		
		else {
			count = 99; // 0~99까지
			
			if(num == 1000)
				num = 999; // 예외 처리
			
			for(int i=100; i<=num; i++) {
				int hun = i / 100;
				int ten = (i/10) % 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}	
		return count;
	}
}
