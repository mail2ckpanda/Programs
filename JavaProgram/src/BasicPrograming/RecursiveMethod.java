package BasicPrograming;

public class RecursiveMethod {

	public static void main(String[] args) {
		//Print 0 to 100 without using for loop
		//printNumber(20,26);
		reverseNumber(4);
		
	}
	
	public static void printNumber(int num) {
		
		if(num<=100) {
			System.out.println(num);
			num=num+1;
			printNumber(num);
		}
	}
	
	public static void printNumber(int n1, int n2) {
		if(n1<=n2) {
			System.out.println(n1);
			n1++;
			printNumber(n1,n2);
		}
	}
	
	public static void reverseNumber(int num){
		if (num>0) {
			int m = num%10;
			System.out.print(num%10);
			
			num = num/10;
			reverseNumber(num);
		}
	}

}
