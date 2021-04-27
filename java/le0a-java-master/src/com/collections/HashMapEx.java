package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {
	public static void main(String[] args) {
//		Map dictionaryMap = new HashMap();
		Map dictionaryMap = new TreeMap();
//	put(Object, Object) 
		dictionaryMap.put("gargantuan", "something very big");
		dictionaryMap.put("aeonian", "lasting for an indefinite period of time");
		dictionaryMap.put("philatelist", "a person who studies about stamps");
//		dictionaryMap.put(null, "No-worries");
//		dictionaryMap.put(null, "A word that cannot without a name");
		dictionaryMap.put("gigantic", "something very big");
		dictionaryMap.put("abracadabra", null);		
		dictionaryMap.put("abcdef", null);	
		System.out.println(dictionaryMap);

		//seach the meaning of a word
		String aeonian = (String)dictionaryMap.get("aeonian");
		System.out.println("Aeonian means : " + aeonian);
		dictionaryMap.put("hakuna-matata", "No-worries");
		boolean wordExists = dictionaryMap.containsKey("hakuna-potata");
		if(wordExists) {
			System.out.println("Key Exists");
		}
		else {
			System.out.println("Key Does not exist");
		}
		
		if(dictionaryMap.containsValue("No-worries")) {
			System.out.println("Value exists");
		}
		else {
			System.out.println("Value does not exist");
		}
			
	}
}