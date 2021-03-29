import java.util.*;

public class N_1157 {

	public static void main(String[] args) {
		int count[] = new int[26];
		int max = -1;
		char write = '?';
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		for(int i=0; i<input.length(); i++) {
			if('A' <= input.charAt(i) && input.charAt(i) <= 'Z') { // 대문자 범위
				count[input.charAt(i) - 'A']++;
			}
			
			else
				count[input.charAt(i) - 'a']++; // 소문자 범위 
				
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i] > max) {
				max = count[i];
				write = (char)(i+65); // 대문자 출력
			}
			else if(count[i] == max) {
				write = '?';
			}
		}
		System.out.println(write);
	}

}
