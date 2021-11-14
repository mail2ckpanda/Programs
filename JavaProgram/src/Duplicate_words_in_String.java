import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_words_in_String {

	public static void main(String[] args) {
		String str = "chandra went to bangalore . chandra went to bangalore TCS.";
		findDuplicateWord(str);
		findWord_Repetation_Count(str);
	}
	
	
	public static void findDuplicateWord(String str) {
		Set<String> st = new HashSet<String>();
		String[] words = str.split(" ");
		for (String x:words) {
			if (st.add(x)==false) {
				System.out.println(x+"is duplicate");
			}
		}
	}
	
	public static void findWord_Repetation_Count(String str) {
//		Set<String> st = new HashSet<String>();
		String[] words = str.split(" ");
		Map<String,Integer> mp = new HashMap<String,Integer>();
		for(String x:words) {
			if (mp.get(x)==null) {
				mp.put(x,1);
			}else {
				mp.put(x,mp.get(x)+1);
			}		
		}
		
		System.out.println(mp);
	}

}
