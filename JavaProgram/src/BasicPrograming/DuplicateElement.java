package BasicPrograming;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,3,6,7,2,3};
		
//		for(int i = 0; i<=a.length-1;i++) {
//			for(int j = i+1;j<=a.length-1;j++) {
//				if (a[i]==a[j])
//					System.out.println(a[i]+" is duplicate");	
//				//break;
//			}
//			
//		}
		
		HashSet<Integer> st = new HashSet<Integer>();
		for(int i = 0; i<=a.length-1;i++) {
			if(st.add(a[i])==false)
				System.out.println(a[i]+" is duplicate");
	}
	
		
	}
	

}
