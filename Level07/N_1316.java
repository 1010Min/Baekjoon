import java.io.*;

public class N_1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		int num = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i=0; i<num; i++) {
			if(check())
				count++;
		}
		System.out.println(count);
		br.close();
	}
	
	public static boolean check() throws IOException{
		boolean check[] = new boolean[26];
		String input = br.readLine();
		int comp = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) != comp) {
				if(!check[input.charAt(i) - 'a']) {
					check[input.charAt(i) - 'a'] = true;
					comp = input.charAt(i);
				}
				else
					return false;
			}
			
		}
		
		return true;
	}
}
