package com.returntypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterfacesReturnTypes {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Tiger"); // returns true or false if added or not
		l1.add(1, "Tiger"); // returns void
		l1.addAll(l1); // returns true or false if added or not
		l1.addAll(1, l1); // returns true or false if added or not
		l1.clear(); // returns void
		l1.contains(l1); // returns true or false depending on if the list contains or not
		l1.containsAll(l1); // returns true or false depending on if the list contains or not
		l1.equals(l1); // returns true or false if the object is equal or not
		l1.get(1); // returns element at specified position - string
		l1.indexOf(l1); // returns int. index of first occurrence of element in list, if not present
		// returns -1
		l1.isEmpty(); // boolean. true or false depending on whether list empty or not.
		l1.iterator();// returns Iterator<Datatypeoflist>
		l1.lastIndexOf(l1); //// returns int. index of last occurrence of element in list, if not present
		//// returns -1
		l1.listIterator(); // ListIterator<Datatypeoflist>
		l1.listIterator(2); // ListIterator<Datatypeoflist>. iteration starts from index
		l1.remove(2); // string. returns element which was present previously.
		l1.remove(l1); // returns true or false if the list contained the specified element.
		l1.removeAll(l1); // returns true or false depending on removal
		l1.retainAll(l1); // returns true or false depending on retention
		l1.set(2, "Tiger"); // return string. the element previously at the position.
		l1.size(); // returns int. the number of elements in the list.

		Stack<String> s3 = new Stack<>();
		s3.empty();// booleans. true if and only if this stack containsno items; false otherwise.
		s3.peek();// string. the object at the top of this stack (the last itemof the Vector
		// object).
		s3.pop(); // string. The object at the top of this stack (the last itemof the Vector
		// object).
		s3.push(null); // string. the item argument.

		Vector<String> v1 = new Vector<>();
		v1.addElement(null); // returns void
		v1.capacity(); // returns int. capacity is returned.
		v1.elementAt(4);// string .returns element at the index.
		v1.elements();// returns Enumeration<Dstatypepresent>
		v1.firstElement();// string. returns first element.
		v1.indexOf(v1, 4); // int. starts from the int specified and returns first occurrence after that
		// index. if not found then -1.
		v1.lastElement(); // string. last element of vector.
		v1.lastIndexOf(v1, 5);// int. searches for last occurrence <=index specified.
		v1.remove(3); // string . element that was removed
		v1.removeAllElements(); // void. removes all elements.
		v1.removeElement(v1);// booleans.true if the argument was a component of thisvector; false otherwise.
		v1.removeElementAt(3); // void.
		v1.setElementAt(null, 4); // void.
		v1.setSize(5); // void.

		ArrayList<String> s1 = new ArrayList<>();
		s1.remove(3);// the element that was removed from index. - string

		LinkedList<String> l2 = new LinkedList<>();
		l2.addFirst(null); // returns void
		l2.addLast(null); // returns void
		l2.getFirst(); // string. returns first element from list
		l2.getLast(); // string. returns first element from list
		l2.remove(); // string .removes head of the list.
		l2.removeFirst(); // string. removes first element from list.
		l2.removeFirstOccurrence(l2); // boolean. returns true if the removed item was present in list else false.
		l2.removeLast(); // string. removes first element from list.
		l2.removeLastOccurrence(l2); // boolean. returns true if the removed item was present in list else false.
	}

}
