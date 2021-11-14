package BasicPrograming;

public class ShiftZerosToRight {

	public static void main(String[] args) {
		int[] a = {1,2,0,1,0,0,8,0,4,5,0};
		int len = a.length;
		int[]a1 = new int[len];
		int n = 0;
		for(int x:a) {
			if (x!=0) {
				a1[n] = x;
				n++;
			}
		}
		
		for(int c:a1) {
			System.out.println(c);
		}
	}

}
