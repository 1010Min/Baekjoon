import java.io.*;

public class N_2292 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int layer = 2;
		
		if(n == 1) System.out.println(1);
		
		else {
			while(layer <= n) {
				layer = layer + (count*6);
				count++;
			}
			System.out.println(count);
		}
		
		br.close();
	}
}

/*
	2~7 : 6개 
	8~19: 12개  
	20~37: 18개 
	38~61: 24개 
*/