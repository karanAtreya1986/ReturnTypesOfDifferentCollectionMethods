package com.returntypes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceReturnTypes {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add(null); // boolean.true if this set did not already contain the specifiedelement
		s1.addAll(s1);// boolean.true if this set changed as a result of the call
		s1.clear(); // void
		s1.contains(s1);// boolean.true if this set contains the specified element
		s1.containsAll(s1); // booelans.true if this set contains all of the elements of thespecified
		// collection
		s1.equals(s1);// boolean.true if the specified object is equal to this set
		s1.isEmpty();// boolean.true if this set contains no elements
		s1.iterator();// Iterator<Datatypeofset>.an iterator over the elements in this set
		s1.remove(s1);// boolean.true if this set contained the specified element
		s1.removeAll(s1);// boolean.true if this set changed as a result of the call
		s1.retainAll(s1);// booleans.true if this set changed as a result of the call
		s1.size();// int.the number of elements in this set (its cardinality)

		TreeSet<String> t1 = new TreeSet<>();
		t1.first();// string.the first (lowest) element currently in this set
		t1.floor("e");// string.the greatest element less than or equal to e,or null if there is no
		// such element
		t1.last();// string.the last (highest) element currently in this set
		t1.lower("e");// string.the greatest element less than e,or null if there is no such element
		t1.pollFirst();// string.the first element, or null if this set is empty
		t1.pollLast();// string.the last element, or null if this set is empty

		LinkedHashSet<String> l1 = new LinkedHashSet<>();
		l1.add("Test");// boolean.true if this set did not already contain the specifiedelement

		HashSet<String> h1 = new HashSet<>();

	}

}
