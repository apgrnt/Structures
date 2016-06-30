package glebe.andrew.utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringUtils {

	public static boolean dupChars(String str) {
		Set<Character> set = new HashSet<Character>();
		for(char c : str.toCharArray()){
			if(set.contains(c)){
				return true;
			} else {
				set.add(c);
			}
		}
		return false;
	}
	
	public static boolean arePermutations(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		Map<Character, Integer> str1CharCount = new HashMap();
		for(char c : str1.toCharArray()){
			if(str1CharCount.containsKey(c)){
				int i = str1CharCount.get(c);
				str1CharCount.put(c, i++);
			} else {
				str1CharCount.put(c, 1);
			}
		}
		for(char c : str2.toCharArray()) {
			if(str1CharCount.containsKey(c)){
				int i = str1CharCount.get(c);
				i--;
				if(i > 0){
					return false;
				}
				str1CharCount.put(c, i);
			}else{
				return false;
			}
		}
		return true;
	}

	public static boolean arePermutations2(String str1, String str2) {
		if(str1.length() != str2.length()){
			return false;
		}
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);
		String sortedStr1 = new String(str1Arr);
		String sortedStr2 = new String(str2Arr);
		
		if(sortedStr1.equalsIgnoreCase(sortedStr2)){
			return true;
		}
		return false;
	}

}
