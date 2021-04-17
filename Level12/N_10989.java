import java.util.*;
import java.io.*;

public class N_10989 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[10001]; // 조건에서 이 수는 10,000보다 작거나 같다고 했으므로 
		
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine())]++; // 입력값에 해당하는 인덱스 1 증가 
		}
		
		for(int i=1; i<10001; i++) { // 빈도수만큼 출력 
			while(arr[i] > 0) {
				sb.append(i).append('\n'); 
				arr[i]--;
			}
		}
		System.out.println(sb);
		
		br.close();
	}
}
