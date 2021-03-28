public class N_4673 {
	static boolean[] istrue = new boolean[10001];
	
	static int d(int n){
		int sum = n;
		
		while(n!=0) {
			sum += (n %10);
			n = n/10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		for(int i=1; i<10001; i++) {
			int num = d(i);
			
			if(num <=10000)
				istrue[num] = true;
		}
		
		for(int i=1; i<10001; i++) {
			if(!istrue[i])
				System.out.println(i);
		}
	}
}
