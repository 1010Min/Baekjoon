import java.io.*;

public class N_2941 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int count = 0;
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			if(ch == 'c' && i <input.length()-1) {
				if(input.charAt(i+1) == '-' || input.charAt(i+1) == '=') { // c= 나 c-인 경우
					i++; // i와 i+1 두 단어가 모두 한 단어이므로 증가 
				}
			}
			
			else if(ch == 'd' && i <input.length()-1) {
				if(input.charAt(i+1) == '-') { // d-인 경우
					i++;
				}
				
				else if(input.charAt(i+1) == 'z' && i<input.length()-2) {
					if(input.charAt(i+2) == '=') { // dz=인 경우
						i += 2;
					}
				}
			}
			
			else if((ch == 'l' || ch == 'n') && i <input.length()-1) {
				if(input.charAt(i+1) == 'j') { // lj나 nj인 경우
					i++;
				}
			}
			
			else if((ch == 's' || ch == 'z') && i <input.length()-1) {
				if(input.charAt(i+1) == '=') { // s=나 z=인 경우
					i++;
				}
			}
			count++;
		}
		System.out.println(count);
		br.close();
	}
}
