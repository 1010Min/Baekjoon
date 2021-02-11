import java.io.*;

public class N_1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		int i = 2;
		int down = 1;
		
		if(input == 1) System.out.println(1+"/"+1);
		
		else {
			while(down < input) {
				down += i;
				i++;
			}
			
			if((i-1) % 2 == 1)
				System.out.println(1+(down-input) + "/" + ((i-1)-(down-input)));
			
			else
				System.out.println(((i-1)-(down-input)) + "/" + (1+(down-input)));
			
		}
		br.close(); 
	}
}

/*
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();

		int n = Integer.parseInt(br.readLine());
		int a = 1;
		
		while(n > a) {
			n -= a++;
		}
		
		if(a % 2 == 0) {
			sb.append(n).append("/").append(a+1 -n);			
		}else {
			sb.append(a+1 -n).append("/").append(n);
		}
		
		bw.write(sb.toString());		
		bw.flush();
		
		br.close();
		bw.close();	
*/