import java.io.*;
import java.util.*;

public class N_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
	
		a = ((a%100)%10)*100 + ((a%100)/10)*10 + a/100;
		b = ((b%100)%10)*100 + ((b%100)/10)*10 + b/100;
		
		if(a> b)
			System.out.println(a);
		else
			System.out.println(b);
		
		br.close();
	}
}
