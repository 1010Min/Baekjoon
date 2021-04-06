import java.io.*;

public class N_7568 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][2];
		String input[];
		
		for(int i=0; i< N; i++) {
			input = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(input[0]); // [i][0]은 몸무게
			arr[i][1] = Integer.parseInt(input[1]); // [0][i]은 키
		}
		
		for(int i=0; i<N; i++) {
			int rank = 1;
			
			for(int j=0; j<N; j++) {
				if(i == j)	continue;
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])	rank++;
			}
			System.out.print(rank + " ");
		}
		br.close();
	}
}

/*
	x1>x2 && y1>y2 -> 2++
	x1>x2 && y1<y2 -> x
	x1<x2 && y1>y2 -> x
	x1<x2 && y1<y2 -> 1++
*/