package com.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapCollectionViewsEx {
	public static void main(String[] args) {
//	Map dictionaryMap = new HashMap();
		Map dictionaryMap = new TreeMap();
//put(Object, Object) 
		dictionaryMap.put("gargantuan", "something very big");
		dictionaryMap.put("aeonian", "lasting for an indefinite period of time");
		dictionaryMap.put("philatelist", "a person who studies about stamps");
//	dictionaryMap.put(null, "No-worries");
//	dictionaryMap.put(null, "A word that cannot without a name");
		dictionaryMap.put("gigantic", "something very big");
		dictionaryMap.put("abracadabra", null);
		dictionaryMap.put("abcdef", null);

		//Working with keys
		Set wordSet = dictionaryMap.keySet();
		Iterator wordIterator = wordSet.iterator();
		while(wordIterator.hasNext()) {
			Object key = wordIterator.next();
			Object value = dictionaryMap.get(key);
			System.out.println(key + " " + value);
		}
		
//		working with values
		Collection meaningCollection = dictionaryMap.values();
		Iterator meaningIterator = meaningCollection.iterator();
		while(meaningIterator.hasNext()) {
			Object value = meaningIterator.next();
			System.out.println(value);
		}
		
//		Working with Mapping
		Set wordEntries  = dictionaryMap.entrySet();
		Iterator entryIterator =  wordEntries.iterator();
		while(entryIterator.hasNext()) {
//			Object value = entryIterator.next();
//			System.out.println(value);
			Map.Entry wordEntry = (Map.Entry)entryIterator.next();
//			System.out.println(wordEntries);
			Object key = wordEntry.getKey();
			Object value = wordEntry.getValue();
			System.out.println(key + " " + value);
		}
	}
}

