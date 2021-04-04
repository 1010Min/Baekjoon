import java.io.*;
import java.util.*;

public class N_2798 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(find(arr, N, M));
		br.close();
	}
	
	public static int find(int[] arr, int N, int M) {
		int result = 0;
		
		// 3개를 고르므로 첫 번째 카드는 N-2까지
		for(int i=0; i<N-2; i++) { 
			// 두 번째 카드는 첫 번째 카드 이후부터 N-1까지
			for(int j=i+1; j<N-1; j++) {
				// 세 번째 카드는 2번째 카드 이후부터 N까지
				for(int k=j+1; k<N; k++) {
					int sum = arr[i] + arr[j]+ arr[k];
					
					if(M == sum)	return sum;
					if(result < sum && sum < M)	result = sum;
				}
			}
		}
		return result;
	}
}
