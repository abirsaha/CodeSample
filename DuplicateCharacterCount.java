package abir.java.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterCount {
	
	public void countDuplicates(String str){
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char [] stringChar = str.toCharArray();
		for(Character ch:stringChar){
			if (map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for(Character ch:keys){
			if (map.get(ch)>1){
				System.out.println("Duplicate "+ch+"- Its count is "+map.get(ch));
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharacterCount dc = new DuplicateCharacterCount();
		System.out.println("Printing Duplicate characters in the string");
		dc.countDuplicates("Tumi aar ami aar aamdader shontaan");
	}

}


