import java.io.*;
import java.util.*;

public class N_2751 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr_list = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			arr_list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr_list);
		
		for(int value : arr_list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
		
		br.close();
	}
}
