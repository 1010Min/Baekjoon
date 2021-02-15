import java.io.*;
import java.util.*;

public class N_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int day = (V - B) / (A - B);
		
		// 더 올라가야 하는 경우
		if((V - B) % (A - B) != 0)	day++;
		
		System.out.println(day);
		
		br.close();
	}
}

// 이렇게 풀면 시간 초과! -> 정상에 올라간 후 미끄러지지 않는다는 조건 중요
//public class N_2869 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//		int V = Integer.parseInt(st.nextToken());
//		int sum = A;
//		int day = 1;
//		
//		while(V > sum) {
//			sum += (A-B);
//			day++;
//		}
//		
//		System.out.println(day);
//		br.close();
//	}
//}
