import java.io.*;
import java.util.StringTokenizer;

public class N_11022 {
	public static void main(String[] args) throws IOException{
		int a, x, y;
		String w;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		a = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			w = Integer.toString(x+y);
			bw.write("Case #"+i+": "+x+" + " + y+" = "+w+"\n");
		}
		bw.flush();
		bw.close();
		br.close(); 
	}
} 