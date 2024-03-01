package com.returntypes;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceReturnTypes {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<>();
		m1.clear();// void
		m1.containsKey(m1);// boolean.true if this map contains a mapping for the specifiedkey
		m1.containsValue(m1);// boolean.true if this map maps one or more keys to thespecified value
		m1.entrySet();// Map.Entry.a set view of the mappings contained in this map
		m1.equals(m1);// booleans.true if the specified object is equal to this map
		m1.get(m1);// Integer.the value to which the specified key is mapped, or null if this map
		// contains no mapping for the key
		m1.getOrDefault(m1, 4);// integer.the value to which the specified key is mapped, or defaultValue if
		// this map contains no mapping for the key
		m1.isEmpty();// boolean.true if this map contains no key-value mappings
		m1.keySet();// set<keytypes>. a set view of the keys contained in this map
		m1.put("Test", 5);// integer.the previous value associated with key, or null if there was no
		// mapping for key.(A null return can also indicate that the mappreviously
		// associated null with key,if the implementation supports null values.)
		m1.putAll(m1); // void
		m1.remove(m1);// integer.the previous value associated with key, or null if there was no
		// mapping for key.
		m1.remove("key", "value");// boolean.true if the value was removed
		m1.size();// int.the number of key-value mappings in this map
		m1.values();// collection<integer>.a collection view of the values contained in this map

		Hashtable<String, Integer> ht1 = new Hashtable<>();
		ht1.contains(ht1);// boolean.true if and only if some key maps to the value argument in this
		// hashtable asdetermined by the equals method; false otherwise.
		ht1.containsKey(ht1);// boolean.true if and only if the specified objectis a key in this hashtable,
		// as determined by the equals method; false otherwise.
		ht1.elements();// enumeration<datatypeofkey>.an enumeration of the values in this hashtable.
		ht1.isEmpty();// boolean.true if this hashtable maps no keys to values; false otherwise.
		ht1.keys();// enumeration<keydatatype>.an enumeration of the keys in this hashtable.
		ht1.remove(ht1);// integer.the value to which the key had been mapped in this hashtable,or null
		// if the key did not have a mapping

		TreeMap<String, Integer> t1 = new TreeMap<>();
		t1.containsValue(t1);// boolean.true if a mapping to value exists; false otherwise
		t1.firstEntry();// entry<key,value datatype>.an entry with the least key,or null if this map is
		// emptySince:
		t1.firstKey();// string.the first (lowest) key currently in this map
		t1.floorEntry("key");// entry<key, value datatype>.an entry with the greatest key less than or equal
		// to key, or null if there is no such key
		t1.floorKey("key"); // string.the greatest key less than or equal to key,or null if there is no such
		// key
		t1.lastEntry();// entry<jey,value datatypes>.an entry with the greatest key,or null if this map
		// is empty
		t1.lastKey();// string.the last (highest) key currently in this map
		t1.lowerEntry("key"); // entry<key,value datatype>. an entry with the greatest key less than key,or
		// null if there is no such key
		t1.lowerKey("key");// string.the greatest key less than key,or null if there is no such key
		t1.pollFirstEntry();// entry<key,value datatype>.the removed first entry of this map,or null if this
		// map is empty
		t1.pollLastEntry();// entry<key,value datatype>.the removed last entry of this map,or null if this
		// map is empty

		LinkedHashMap<Integer, String> l1 = new LinkedHashMap<>();

		HashMap<Integer, String> h1 = new HashMap<>();

	}

}
